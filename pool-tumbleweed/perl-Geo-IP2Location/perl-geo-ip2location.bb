SUMMARY = "Lookup of country, region, city, latitude, longitude, ZIP code, time zon[cut]"
DESCRIPTION = "This Perl module provides a fast and simple way to look up geolocation and \
network information for an IP address using an IP2Location BIN database. \
 \
It allows you to retrieve a wide range of data using IPv4 and IPv6 \
addresses, including: \
 \
 a) Geolocation: Country, Region, City, Latitude, Longitude, ZIP Code, Time Zone, District, Elevation \
 b) Network: ISP, Domain Name, Connection Type, IP Address Type, Usage Type \
 c) Carrier Information: Mobile Country Code (MCC), Mobile Network Code (MNC), Mobile Carrier Brand \
 d) Autonomous System (AS): AS Number, AS Name, AS Domain Name, AS Usage Type, AS CIDR \
 e) Additional Data: IDD Code, Area Code, Weather Station Code, Weather Station Name, IAB Advertising Category \
 \
This module can be used in many types of project such as: \
 \
 1) Selecting the geographically closest mirror for content delivery. \
 2) Analyzing web server logs to determine the countries of your visitors. \
 3) Detecting and preventing credit card fraud. \
 4) Implementing software export controls. \
 5) Displaying native languages and currencies to users. \
 6) Preventing password sharing and service abuse. \
 7) Geotargeting content and advertisements. \
 \
To ensure high accuracy, the commercial databases are updated on a daily, \
weekly or semi-monthly basis."
LICENSE = "MIT"

PV = "8.800.0"

RPM_NAME = "perl-Geo-IP2Location-8.800.0-1.5.noarch.rpm"
RPM_HASH = "928810d9059fa396ea2e33480ef8cea24e7ecbc477b031b663d469a05ce22b96e6e2d54a525faeb642b6e8489129bf86a28205dbfaaf3bc33481baa9c3736eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geo--IP2Location \
perl-Geo-IP2Location"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
