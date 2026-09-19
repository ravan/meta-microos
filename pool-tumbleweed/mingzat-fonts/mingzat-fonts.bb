SUMMARY = "Lepcha Font"
DESCRIPTION = "Mingzat is a Unicode font based on Jason Glavy's JG Lepcha custom-encoded font."
LICENSE = "OFL-1.1"

PV = "1.100"

RPM_NAME = "mingzat-fonts-1.100-1.10.noarch.rpm"
RPM_HASH = "0e8efb2da36d195fefbb37474de7238e7632858022292741218d538ebe3e26e888035889827f95cdafb1ec9ab4102e8de1485ab4e4c5fba05a7c3eb4d25860c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingzat-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
