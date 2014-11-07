/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Aug 20 19:51:31 BRT 2014
 */
package org.jboss.keynote.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;

/**
 * Salesforce DTO for SObject Organization
 */
@XStreamAlias("Organization")
public class Organization extends AbstractSObjectBase {

    // Division
    private String Division;

    @JsonProperty("Division")
    public String getDivision() {
        return this.Division;
    }

    @JsonProperty("Division")
    public void setDivision(String Division) {
        this.Division = Division;
    }

    // Street
    private String Street;

    @JsonProperty("Street")
    public String getStreet() {
        return this.Street;
    }

    @JsonProperty("Street")
    public void setStreet(String Street) {
        this.Street = Street;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // PostalCode
    private String PostalCode;

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return this.PostalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Fax
    private String Fax;

    @JsonProperty("Fax")
    public String getFax() {
        return this.Fax;
    }

    @JsonProperty("Fax")
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    // PrimaryContact
    private String PrimaryContact;

    @JsonProperty("PrimaryContact")
    public String getPrimaryContact() {
        return this.PrimaryContact;
    }

    @JsonProperty("PrimaryContact")
    public void setPrimaryContact(String PrimaryContact) {
        this.PrimaryContact = PrimaryContact;
    }

    // DefaultLocaleSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultLocaleSidKeyEnum DefaultLocaleSidKey;

    @JsonProperty("DefaultLocaleSidKey")
    public DefaultLocaleSidKeyEnum getDefaultLocaleSidKey() {
        return this.DefaultLocaleSidKey;
    }

    @JsonProperty("DefaultLocaleSidKey")
    public void setDefaultLocaleSidKey(DefaultLocaleSidKeyEnum DefaultLocaleSidKey) {
        this.DefaultLocaleSidKey = DefaultLocaleSidKey;
    }

    // LanguageLocaleKey
    @XStreamConverter(PicklistEnumConverter.class)
    private LanguageLocaleKeyEnum LanguageLocaleKey;

    @JsonProperty("LanguageLocaleKey")
    public LanguageLocaleKeyEnum getLanguageLocaleKey() {
        return this.LanguageLocaleKey;
    }

    @JsonProperty("LanguageLocaleKey")
    public void setLanguageLocaleKey(LanguageLocaleKeyEnum LanguageLocaleKey) {
        this.LanguageLocaleKey = LanguageLocaleKey;
    }

    // ReceivesInfoEmails
    private Boolean ReceivesInfoEmails;

    @JsonProperty("ReceivesInfoEmails")
    public Boolean getReceivesInfoEmails() {
        return this.ReceivesInfoEmails;
    }

    @JsonProperty("ReceivesInfoEmails")
    public void setReceivesInfoEmails(Boolean ReceivesInfoEmails) {
        this.ReceivesInfoEmails = ReceivesInfoEmails;
    }

    // ReceivesAdminInfoEmails
    private Boolean ReceivesAdminInfoEmails;

    @JsonProperty("ReceivesAdminInfoEmails")
    public Boolean getReceivesAdminInfoEmails() {
        return this.ReceivesAdminInfoEmails;
    }

    @JsonProperty("ReceivesAdminInfoEmails")
    public void setReceivesAdminInfoEmails(Boolean ReceivesAdminInfoEmails) {
        this.ReceivesAdminInfoEmails = ReceivesAdminInfoEmails;
    }

    // PreferencesRequireOpportunityProducts
    private Boolean PreferencesRequireOpportunityProducts;

    @JsonProperty("PreferencesRequireOpportunityProducts")
    public Boolean getPreferencesRequireOpportunityProducts() {
        return this.PreferencesRequireOpportunityProducts;
    }

    @JsonProperty("PreferencesRequireOpportunityProducts")
    public void setPreferencesRequireOpportunityProducts(Boolean PreferencesRequireOpportunityProducts) {
        this.PreferencesRequireOpportunityProducts = PreferencesRequireOpportunityProducts;
    }

    // FiscalYearStartMonth
    private Integer FiscalYearStartMonth;

    @JsonProperty("FiscalYearStartMonth")
    public Integer getFiscalYearStartMonth() {
        return this.FiscalYearStartMonth;
    }

    @JsonProperty("FiscalYearStartMonth")
    public void setFiscalYearStartMonth(Integer FiscalYearStartMonth) {
        this.FiscalYearStartMonth = FiscalYearStartMonth;
    }

    // UsesStartDateAsFiscalYearName
    private Boolean UsesStartDateAsFiscalYearName;

    @JsonProperty("UsesStartDateAsFiscalYearName")
    public Boolean getUsesStartDateAsFiscalYearName() {
        return this.UsesStartDateAsFiscalYearName;
    }

    @JsonProperty("UsesStartDateAsFiscalYearName")
    public void setUsesStartDateAsFiscalYearName(Boolean UsesStartDateAsFiscalYearName) {
        this.UsesStartDateAsFiscalYearName = UsesStartDateAsFiscalYearName;
    }

    // DefaultAccountAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultAccountAccessEnum DefaultAccountAccess;

    @JsonProperty("DefaultAccountAccess")
    public DefaultAccountAccessEnum getDefaultAccountAccess() {
        return this.DefaultAccountAccess;
    }

    @JsonProperty("DefaultAccountAccess")
    public void setDefaultAccountAccess(DefaultAccountAccessEnum DefaultAccountAccess) {
        this.DefaultAccountAccess = DefaultAccountAccess;
    }

    // DefaultContactAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultContactAccessEnum DefaultContactAccess;

    @JsonProperty("DefaultContactAccess")
    public DefaultContactAccessEnum getDefaultContactAccess() {
        return this.DefaultContactAccess;
    }

    @JsonProperty("DefaultContactAccess")
    public void setDefaultContactAccess(DefaultContactAccessEnum DefaultContactAccess) {
        this.DefaultContactAccess = DefaultContactAccess;
    }

    // DefaultOpportunityAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultOpportunityAccessEnum DefaultOpportunityAccess;

    @JsonProperty("DefaultOpportunityAccess")
    public DefaultOpportunityAccessEnum getDefaultOpportunityAccess() {
        return this.DefaultOpportunityAccess;
    }

    @JsonProperty("DefaultOpportunityAccess")
    public void setDefaultOpportunityAccess(DefaultOpportunityAccessEnum DefaultOpportunityAccess) {
        this.DefaultOpportunityAccess = DefaultOpportunityAccess;
    }

    // DefaultLeadAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultLeadAccessEnum DefaultLeadAccess;

    @JsonProperty("DefaultLeadAccess")
    public DefaultLeadAccessEnum getDefaultLeadAccess() {
        return this.DefaultLeadAccess;
    }

    @JsonProperty("DefaultLeadAccess")
    public void setDefaultLeadAccess(DefaultLeadAccessEnum DefaultLeadAccess) {
        this.DefaultLeadAccess = DefaultLeadAccess;
    }

    // DefaultCaseAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultCaseAccessEnum DefaultCaseAccess;

    @JsonProperty("DefaultCaseAccess")
    public DefaultCaseAccessEnum getDefaultCaseAccess() {
        return this.DefaultCaseAccess;
    }

    @JsonProperty("DefaultCaseAccess")
    public void setDefaultCaseAccess(DefaultCaseAccessEnum DefaultCaseAccess) {
        this.DefaultCaseAccess = DefaultCaseAccess;
    }

    // DefaultCalendarAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultCalendarAccessEnum DefaultCalendarAccess;

    @JsonProperty("DefaultCalendarAccess")
    public DefaultCalendarAccessEnum getDefaultCalendarAccess() {
        return this.DefaultCalendarAccess;
    }

    @JsonProperty("DefaultCalendarAccess")
    public void setDefaultCalendarAccess(DefaultCalendarAccessEnum DefaultCalendarAccess) {
        this.DefaultCalendarAccess = DefaultCalendarAccess;
    }

    // DefaultPricebookAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultPricebookAccessEnum DefaultPricebookAccess;

    @JsonProperty("DefaultPricebookAccess")
    public DefaultPricebookAccessEnum getDefaultPricebookAccess() {
        return this.DefaultPricebookAccess;
    }

    @JsonProperty("DefaultPricebookAccess")
    public void setDefaultPricebookAccess(DefaultPricebookAccessEnum DefaultPricebookAccess) {
        this.DefaultPricebookAccess = DefaultPricebookAccess;
    }

    // DefaultCampaignAccess
    @XStreamConverter(PicklistEnumConverter.class)
    private DefaultCampaignAccessEnum DefaultCampaignAccess;

    @JsonProperty("DefaultCampaignAccess")
    public DefaultCampaignAccessEnum getDefaultCampaignAccess() {
        return this.DefaultCampaignAccess;
    }

    @JsonProperty("DefaultCampaignAccess")
    public void setDefaultCampaignAccess(DefaultCampaignAccessEnum DefaultCampaignAccess) {
        this.DefaultCampaignAccess = DefaultCampaignAccess;
    }

    // ComplianceBccEmail
    private String ComplianceBccEmail;

    @JsonProperty("ComplianceBccEmail")
    public String getComplianceBccEmail() {
        return this.ComplianceBccEmail;
    }

    @JsonProperty("ComplianceBccEmail")
    public void setComplianceBccEmail(String ComplianceBccEmail) {
        this.ComplianceBccEmail = ComplianceBccEmail;
    }

    // UiSkin
    @XStreamConverter(PicklistEnumConverter.class)
    private UiSkinEnum UiSkin;

    @JsonProperty("UiSkin")
    public UiSkinEnum getUiSkin() {
        return this.UiSkin;
    }

    @JsonProperty("UiSkin")
    public void setUiSkin(UiSkinEnum UiSkin) {
        this.UiSkin = UiSkin;
    }

    // TrialExpirationDate
    private org.joda.time.DateTime TrialExpirationDate;

    @JsonProperty("TrialExpirationDate")
    public org.joda.time.DateTime getTrialExpirationDate() {
        return this.TrialExpirationDate;
    }

    @JsonProperty("TrialExpirationDate")
    public void setTrialExpirationDate(org.joda.time.DateTime TrialExpirationDate) {
        this.TrialExpirationDate = TrialExpirationDate;
    }

    // OrganizationType
    @XStreamConverter(PicklistEnumConverter.class)
    private OrganizationTypeEnum OrganizationType;

    @JsonProperty("OrganizationType")
    public OrganizationTypeEnum getOrganizationType() {
        return this.OrganizationType;
    }

    @JsonProperty("OrganizationType")
    public void setOrganizationType(OrganizationTypeEnum OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    // WebToCaseDefaultOrigin
    private String WebToCaseDefaultOrigin;

    @JsonProperty("WebToCaseDefaultOrigin")
    public String getWebToCaseDefaultOrigin() {
        return this.WebToCaseDefaultOrigin;
    }

    @JsonProperty("WebToCaseDefaultOrigin")
    public void setWebToCaseDefaultOrigin(String WebToCaseDefaultOrigin) {
        this.WebToCaseDefaultOrigin = WebToCaseDefaultOrigin;
    }

    // MonthlyPageViewsUsed
    private Integer MonthlyPageViewsUsed;

    @JsonProperty("MonthlyPageViewsUsed")
    public Integer getMonthlyPageViewsUsed() {
        return this.MonthlyPageViewsUsed;
    }

    @JsonProperty("MonthlyPageViewsUsed")
    public void setMonthlyPageViewsUsed(Integer MonthlyPageViewsUsed) {
        this.MonthlyPageViewsUsed = MonthlyPageViewsUsed;
    }

    // MonthlyPageViewsEntitlement
    private Integer MonthlyPageViewsEntitlement;

    @JsonProperty("MonthlyPageViewsEntitlement")
    public Integer getMonthlyPageViewsEntitlement() {
        return this.MonthlyPageViewsEntitlement;
    }

    @JsonProperty("MonthlyPageViewsEntitlement")
    public void setMonthlyPageViewsEntitlement(Integer MonthlyPageViewsEntitlement) {
        this.MonthlyPageViewsEntitlement = MonthlyPageViewsEntitlement;
    }

}
