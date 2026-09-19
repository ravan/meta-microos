SUMMARY = "JEOS module for full disk encryption enrollment"
DESCRIPTION = "JEOS module for full disk encryption enrollment. The module \
present the different options and delegate into sdbootutil-enroll \
service the effective enrollment."
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-jeos-firstboot-enroll-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "53d05ee9b6056ffbfc54b1af57f436e8778080fb4a5de80be08b7f6acd50b5e4614c936ad5f780052d3d151ec080bc3a695c044e40605a7e939c2402cce574cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-jeos-firstboot-enroll"

RDEPENDS:${PN} += "jeos-firstboot \
sdbootutil \
sdbootutil-enroll"

inherit rpm
