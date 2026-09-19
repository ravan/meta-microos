SUMMARY = "Perl extension for Latitude Longitude conversions"
DESCRIPTION = "This module will translate latitude longitude coordinates to Universal \
Transverse Mercator(UTM) coordinates and vice versa."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Geo-Coordinates-UTM-0.11-5.40.noarch.rpm"
RPM_HASH = "0c70f40a1dcb47bef3988d6b07f3e9e3a3397448ba5473c34492e99c0da240d3225d7e5c72d933073984f2e02818b318807189d40e0a70bc4a55cf17cb789c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geo--Coordinates--UTM \
perl-Geo-Coordinates-UTM"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
