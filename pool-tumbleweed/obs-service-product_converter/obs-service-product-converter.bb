SUMMARY = "An OBS source service: create product media build descriptions"
DESCRIPTION = "Use this product converter to create product builds for openSUSE Tumbleweed or \
SLE 15."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "obs-service-product_converter-1.5.6-1.9.noarch.rpm"
RPM_HASH = "e85e9215dd0f6937bea86d500900d2d3981a6fc61e79ad91898295747ae6847b324bb7e0ecb9b3699ba15d61b6a03668d24cd799659815f7c9a30ce9ffc0b889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-product-converter \
perl-BSKiwiXML \
perl-BSProductXML \
perl-BSUtil \
perl-BSXML"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl-XML--Structured \
perl-XML-Parser \
perl-XML-Structured"

inherit rpm
