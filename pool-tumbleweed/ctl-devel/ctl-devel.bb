SUMMARY = "Development package for CTL"
DESCRIPTION = "This package contain the devel files for CTL."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "ctl-devel-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "1a1a129af45eed2f268d02b85f262c35294dfb5f9de8ee0bc8ffa9e1e8b30aa77deb310da11deb2751e943f6f4420beec02c148d0131adba95b0a835e3db5a28"

RPROVIDES:${PN} += "ctl-devel"

RDEPENDS:${PN} += "ctl \
libIlmCtl1-5 \
libIlmCtlMath1-5 \
libIlmCtlSimd1-5 \
openexr-devel"

inherit rpm
