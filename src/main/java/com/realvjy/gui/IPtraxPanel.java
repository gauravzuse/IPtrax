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

        ipText =new JTextField("0.0.0.0");
        domainText= new JTextField();
        countryText = new JTextField("Country");
        countryCodeText = new JTextField("Country Code");
        regionNameText = new JTextField("Region");
        regionText = new JTextField("Region Code");
        cityText = new JTextField("City");
        zipText = new JTextField("0000000");
        latText = new JTextField("00.0000");
        lonText = new JTextField("00.0000");
        tZoneText = new JTextField("Time Zone");
        ispText = new JTextField("ISP Name");
        orgText = new JTextField("Organization");
        asNameText = new JTextField("AS Number/Name");
        statusText = new JTextField();
        msgText = new JTextField();
        searchText = new JTextField("Search by IP/domain");
        searchBtn = new JButton("Search");
        inputPanel = new JPanel(new GridBagLayout());
        outputPanel = new JPanel(new GridBagLayout());
        radioBtnGr = new ButtonGroup();
        ipRadio = new JRadioButton("IP");
        urlRadio = new JRadioButton("URL");
        radioBtnGr.add(ipRadio);
        radioBtnGr.add(urlRadio);
    }

    private void addLayout(){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(conInfoLabel,gbc);
        gbc.gridy = 1;
        inputPanel.add(searchText,gbc);
        gbc.gridy = 2;
        inputPanel.add(ipRadio,gbc);
        gbc.gridx = 1;
        inputPanel.add(urlRadio,gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(searchBtn,gbc);

        /*Output*/
        gbc.gridx = 0;
        gbc.gridy = 0;
        outputPanel.add(ipLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(ipText,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        outputPanel.add(countryLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(countryText,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        outputPanel.add(countryCodeLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(countryCodeText,gbc);
        gbc.gridy = 3;
        gbc.gridx = 0;
        outputPanel.add(regionNameLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(regionNameText,gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        outputPanel.add(regionLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(regionText,gbc);
        gbc.gridy = 5;
        gbc.gridx = 0;
        outputPanel.add(cityLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(cityText,gbc);
        gbc.gridy = 6;
        gbc.gridx = 0;
        outputPanel.add(zipLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(zipText,gbc);
        gbc.gridy = 7;
        gbc.gridx = 0;
        outputPanel.add(latLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(latText,gbc);
        gbc.gridy = 8;
        gbc.gridx = 0;
        outputPanel.add(lonLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(lonText,gbc);
        gbc.gridy = 9;
        gbc.gridx = 0;
        outputPanel.add(tZoneLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(tZoneText,gbc);
        gbc.gridy = 10;
        gbc.gridx = 0;
        outputPanel.add(ispLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(ispText,gbc);
        gbc.gridy = 11;
        gbc.gridx = 0;
        outputPanel.add(orgLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(orgText,gbc);
        gbc.gridy = 12;
        gbc.gridx = 0;
        outputPanel.add(asNameLabel,gbc);
        gbc.gridx = 1;
        outputPanel.add(asNameText,gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(inputPanel,gbc);
        gbc.gridy = 1;
        this.add(outputPanel,gbc);
    }
}
