SUMMARY = "openSUSE Tumbleweed branding for YaST2 Qt"
DESCRIPTION = "openSUSE Tumbleweed branding for YaST2 Qt, mainly used for installation"
LICENSE = "BSD-3-Clause"

PV = "84.87.20240405"

RPM_NAME = "yast2-qt-branding-openSUSE-84.87.20240405-5.5.noarch.rpm"
RPM_HASH = "68c27d37b196c29d000afa396fd4eafc6790d6d58d14eb1515d3e9841db31067ee01607dbbdfc5c79227f21466dc7228f30336020b4e1a9b6a546406fa57679e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-qt-branding \
yast2-qt-branding-openSUSE"

RDEPENDS:${PN} += "adobe-sourcesans3-fonts \
distribution-logos \
google-opensans-fonts"

inherit rpm
