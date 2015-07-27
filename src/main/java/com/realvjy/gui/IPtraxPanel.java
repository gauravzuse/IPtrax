package com.realvjy.gui;

import com.realvjy.model.IPtraxModel;
import com.realvjy.util.DomainToIP;
import com.realvjy.util.DomainValidate;
import com.realvjy.util.IPcheck;
import com.realvjy.util.TestConnection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * @author realv_000 on 7/25/2015.
 */
public class IPtraxPanel extends JPanel {
    private JLabel conInfoLabel, ipLabel, domainLabel, countryLabel, countryCodeLabel, regionLabel, regionNameLabel, cityLabel;
    private JLabel zipLabel, latLabel, lonLabel, tZoneLabel, ispLabel, orgLabel, asNameLabel, statusLabel, msgLabel;
    private JTextField ipText, domainText, countryText, countryCodeText, regionText, regionNameText, cityText;
    private JTextField zipText, latText, lonText, tZoneText, ispText, orgText, asNameText, statusText, msgText;
    private JTextField searchText;
    private JButton searchBtn;
    private JRadioButton ipRadio, urlRadio;
    private JPanel inputPanel, outputPanel;
    private ButtonGroup radioBtnGr;
    private GridBagLayout inputLayout, outputLayout;
    private BorderLayout panelLayout;
    private GridBagConstraints inputGbc, outputGbc;
    private JLabel sName;
    IPtraxModel iPtraxModel;

    public IPtraxPanel() {
        initilizeComponent();
        addLayout();
    }

    private void initilizeComponent() {
        iPtraxModel = new IPtraxModel();
        Font font = new Font("Segoe UI",Font.PLAIN,16);
        setFont(font);
        conInfoLabel = new JLabel("Your Public IP: "+TestConnection.isOnline());
        ipLabel = new JLabel("IP Address:");
        domainLabel = new JLabel("Domain:");
        countryLabel = new JLabel("Country:");
        countryCodeLabel = new JLabel("Country Code:");
        regionNameLabel = new JLabel("Region Name:");
        regionLabel = new JLabel("Region Code:");
        cityLabel = new JLabel("City:");
        zipLabel = new JLabel("Zip Code:");
        latLabel = new JLabel("Latitude:");
        lonLabel = new JLabel("Longitude:");
        tZoneLabel = new JLabel("Time Zone:");
        ispLabel = new JLabel("ISP:");
        orgLabel = new JLabel("Organization:");
        asNameLabel = new JLabel("AS No/Name:");
        statusLabel = new JLabel("Status:");
        msgLabel = new JLabel("");

        ipText =new JTextField("",20);
        domainText= new JTextField("",20);
        countryText = new JTextField("",20);
        countryCodeText = new JTextField("",20);
        regionNameText = new JTextField("",20);
        regionText = new JTextField("",20);
        cityText = new JTextField("",20);
        zipText = new JTextField("",20);
        latText = new JTextField("",20);
        lonText = new JTextField("",20);
        tZoneText = new JTextField("",20);
        ispText = new JTextField("",20);
        orgText = new JTextField("",20);
        asNameText = new JTextField("",20);
        statusText = new JTextField("",20);
        msgText = new JTextField("",20);
        searchText = new JTextField("Search by IP/domain",20);
        searchBtn = new JButton("Search");
        radioBtnGr = new ButtonGroup();
        ipRadio = new JRadioButton("IP");
        urlRadio = new JRadioButton("URL");
        sName = new JLabel("IPtrax 0.0.1 by realvjy");
        sName.setForeground(new Color(116, 116, 113));
        sName.setFont(new Font("Arial",Font.ITALIC,12));
        inputLayout = new GridBagLayout();
        outputLayout = new GridBagLayout();
        panelLayout= new BorderLayout();
        inputGbc = new GridBagConstraints();
        outputGbc = new GridBagConstraints();
        inputPanel = new JPanel(inputLayout);
        outputPanel = new JPanel(outputLayout);
        radioBtnGr.add(ipRadio);
        radioBtnGr.add(urlRadio);

        /*Add Listener to buttons*/
        IPtraxListener iPtraxListener = new IPtraxListener(this);
        searchBtn.addActionListener(iPtraxListener);
        ipRadio.addActionListener(iPtraxListener);
        urlRadio.addActionListener(iPtraxListener);
    }

    private void addLayout(){
        this.setLayout(panelLayout);
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
       /* this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10), // outer
                // border
                BorderFactory.createLoweredBevelBorder()));*/
        inputGbc.gridx = 0;
        inputGbc.gridy = 0;
        inputGbc.gridwidth = 2;
        inputGbc.insets = new Insets(2,2,2,2);
        inputPanel.add(conInfoLabel,inputGbc);
        inputGbc.gridy = 1;
        inputPanel.add(searchText,inputGbc);
        inputGbc.gridy = 2;
        inputGbc.gridwidth = 1;
        inputGbc.anchor = GridBagConstraints.WEST;
        inputPanel.add(ipRadio,inputGbc);
        inputGbc.gridx = 1;
        inputPanel.add(urlRadio,inputGbc);
        inputGbc.gridx = 0;
        inputGbc.gridy = 3;
        inputGbc.gridwidth = 2;
        inputGbc.anchor = GridBagConstraints.CENTER;
        inputPanel.add(searchBtn,inputGbc);

        /*Output*/
        outputGbc.gridx = 0;
        outputGbc.gridy = 0;
        outputGbc.insets = new Insets(4,4,4,4);
        outputGbc.anchor = GridBagConstraints.EAST;
        outputPanel.add(ipLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(ipText,outputGbc);
        outputGbc.gridx = 0;
        outputGbc.gridy = 1;
        outputPanel.add(countryLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(countryText,outputGbc);
        outputGbc.gridx = 0;
        outputGbc.gridy = 2;
        outputPanel.add(countryCodeLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(countryCodeText,outputGbc);
        outputGbc.gridy = 3;
        outputGbc.gridx = 0;
        outputPanel.add(regionNameLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(regionNameText,outputGbc);
        outputGbc.gridx = 0;
        outputGbc.gridy = 4;
        outputPanel.add(regionLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(regionText,outputGbc);
        outputGbc.gridy = 5;
        outputGbc.gridx = 0;
        outputPanel.add(cityLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(cityText,outputGbc);
        outputGbc.gridy = 6;
        outputGbc.gridx = 0;
        outputPanel.add(zipLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(zipText,outputGbc);
        outputGbc.gridy = 7;
        outputGbc.gridx = 0;
        outputPanel.add(latLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(latText,outputGbc);
        outputGbc.gridy = 8;
        outputGbc.gridx = 0;
        outputPanel.add(lonLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(lonText,outputGbc);
        outputGbc.gridy = 9;
        outputGbc.gridx = 0;
        outputPanel.add(tZoneLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(tZoneText,outputGbc);
        outputGbc.gridy = 10;
        outputGbc.gridx = 0;
        outputPanel.add(ispLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(ispText,outputGbc);
        outputGbc.gridy = 11;
        outputGbc.gridx = 0;
        outputPanel.add(orgLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(orgText,outputGbc);
        outputGbc.gridy = 12;
        outputGbc.gridx = 0;
        outputPanel.add(asNameLabel,outputGbc);
        outputGbc.gridx = 1;
        outputPanel.add(asNameText,outputGbc);
        outputGbc.gridy = 13;
        outputGbc.gridwidth = 2;
        outputPanel.add(sName,outputGbc);
        this.add(inputPanel,BorderLayout.NORTH);
        this.add(outputPanel,BorderLayout.CENTER);
    }

    public void getInfo(int i){
        String searchTxt = searchText.getText();
        String ip = "";
        if (i == 12){
            searchTxt = DomainValidate.validate(searchTxt);
            ip = DomainToIP.convert(searchTxt);
            iPtraxModel.setIpToInfoModel(ip);
            iPtraxModel.setInfo();
            showInfo();
        } else {
            IPcheck chk = new IPcheck(searchTxt);
            ip = chk.validate();
            iPtraxModel.setIpToInfoModel(ip);
            iPtraxModel.setInfo();
            showInfo();
        }
    }

    public void showInfo(){
        conInfoLabel = new JLabel("Your Public IP: "+TestConnection.isOnline());
        if (iPtraxModel.getiPinfoModel().getiP().equals("0.0.0.0") || iPtraxModel.getiPinfoModel().getiP().equals("Unknown")){
            clearTextField();
            JOptionPane.showMessageDialog(null, "Invalid URL/IP", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (iPtraxModel.getiPinfoModel().getStatus().equals("success")) {
                System.out.println(iPtraxModel.getiPinfoModel().getStatus());
                ipText.setText(iPtraxModel.getiPinfoModel().getiP());
                countryText.setText(iPtraxModel.getiPinfoModel().getCountry());
                countryCodeText.setText(iPtraxModel.getiPinfoModel().getCountryCode());
                regionNameText.setText(iPtraxModel.getiPinfoModel().getRegionName());
                regionText.setText(iPtraxModel.getiPinfoModel().getRegion());
                cityText.setText(iPtraxModel.getiPinfoModel().getCity());
                zipText.setText(iPtraxModel.getiPinfoModel().getZipCode());
                latText.setText(iPtraxModel.getiPinfoModel().getLatitude());
                lonText.setText(iPtraxModel.getiPinfoModel().getLongitude());
                tZoneText.setText(iPtraxModel.getiPinfoModel().getTimeZone());
                ispText.setText(iPtraxModel.getiPinfoModel().getIsp());
                orgText.setText(iPtraxModel.getiPinfoModel().getOrganization());
                asNameText.setText(iPtraxModel.getiPinfoModel().getAsNameNo());
            }
            if (iPtraxModel.getiPinfoModel().getStatus().equals("fail")){
                JOptionPane.showMessageDialog(null, iPtraxModel.getiPinfoModel().getMsg(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void clearTextField(){
        ipText.setText("");
        countryText.setText("");
        countryCodeText.setText("");
        regionNameText.setText("");
        regionText.setText("");
        cityText.setText("");
        zipText.setText("");
        latText.setText("");
        lonText.setText("");
        tZoneText.setText("");
        ispText.setText("");
        orgText.setText("");
        asNameText.setText("");
    }
}
