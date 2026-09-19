SUMMARY = "Application for updating Flipper Zero firmware - udev rules"
DESCRIPTION = "Application for updating Flipper Zero firmware - udev rules. \
The user must be in the dialout group."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3+git0.1699609231.bfce851"

RPM_NAME = "qFlipper-base-1.3.3+git0.1699609231.bfce851-4.11.noarch.rpm"
RPM_HASH = "15b6ae2e29f1e141b1fb1c8d657a75bc0e856e507bd5b64804b6cd1cd1bc90f558247c9f940053a7a3f11b221d3b4aa810ca2a9f5af94cda21998662b6978373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qFlipper-base"

RDEPENDS:${PN} += ""

inherit rpm
