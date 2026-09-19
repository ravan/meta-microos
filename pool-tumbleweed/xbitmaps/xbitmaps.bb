SUMMARY = "Base X bitmaps"
DESCRIPTION = "This package contains the base X bitmaps, which are used in many \
legacy X clients."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xbitmaps-1.1.4-1.2.noarch.rpm"
RPM_HASH = "6f4a87098f3e2696414ad5fac7918074fde7f1f403e35e22657752a3666fc2999951046c23754b83fc01d03276a34650c2dac47289a94aa3f92535bf1b1f5222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xbitmaps"

RDEPENDS:${PN} += ""

inherit rpm
