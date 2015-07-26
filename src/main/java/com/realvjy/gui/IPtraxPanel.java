package com.realvjy.gui;

import com.realvjy.model.IPtraxModel;

import javax.swing.*;
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
    IPtraxModel iPtraxModel;

    public IPtraxPanel() {
        initilizeComponent();
        addLayout();
    }

    private void initilizeComponent() {
        iPtraxModel = new IPtraxModel();
        Font font = new Font("Segoe UI",Font.PLAIN,14);
        setFont(font);
        conInfoLabel = new JLabel("Connection:");
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

        ipText =new JTextField("0.0.0.0",20);
        domainText= new JTextField("",20);
        countryText = new JTextField("Country",20);
        countryCodeText = new JTextField("Country Code",20);
        regionNameText = new JTextField("Region",20);
        regionText = new JTextField("Region Code",20);
        cityText = new JTextField("City",20);
        zipText = new JTextField("0000000",20);
        latText = new JTextField("00.0000",20);
        lonText = new JTextField("00.0000",20);
        tZoneText = new JTextField("Time Zone",20);
        ispText = new JTextField("ISP Name",20);
        orgText = new JTextField("Organization",20);
        asNameText = new JTextField("AS Number/Name",20);
        statusText = new JTextField("",20);
        msgText = new JTextField("",20);
        searchText = new JTextField("Search by IP/domain",20);
        searchBtn = new JButton("Search");
        radioBtnGr = new ButtonGroup();
        ipRadio = new JRadioButton("IP");
        urlRadio = new JRadioButton("URL");
        inputLayout = new GridBagLayout();
        outputLayout = new GridBagLayout();
        panelLayout= new BorderLayout();
        inputGbc = new GridBagConstraints();
        outputGbc = new GridBagConstraints();
        inputPanel = new JPanel(inputLayout);
        outputPanel = new JPanel(outputLayout);
        radioBtnGr.add(ipRadio);
        radioBtnGr.add(urlRadio);
    }

    private void addLayout(){
        this.setLayout(panelLayout);
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
        outputGbc.gridx = 0;
        outputGbc.gridy = 0;
        this.add(inputPanel,BorderLayout.NORTH);
        outputGbc.gridy = 1;
        this.add(outputPanel,BorderLayout.CENTER);
    }
}
