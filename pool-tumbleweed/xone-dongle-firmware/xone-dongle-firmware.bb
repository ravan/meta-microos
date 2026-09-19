SUMMARY = "Xbox Wireless Controller Adapter firmware downloader"
DESCRIPTION = "This package installs an update script which downloads the firmware \
for the Xbox Wireless Controller Adapter (wireless dongle) from \
Microsoft. The firmware itself is proprietary and is not shipped \
in this package. \
 \
During installation or update, the user is shown Microsoft's Terms \
of Use. By downloading and using the firmware, you agree to \
Microsoft's terms of use: \
https://www.microsoft.com/en-us/legal/terms-of-use"
LICENSE = "GPL-3.0-or-later"

PV = "0+git20251208.d8be599"

RPM_NAME = "xone-dongle-firmware-0+git20251208.d8be599-1.8.noarch.rpm"
RPM_HASH = "d5c24c1d82c7666611225d91ba468adf818bbe3bada74913ba34021918445ed9dab419db159d776dcd69fe472bb60887525c0dd77799f684efa970d399ca6c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-xone-dongle-02e6.bin \
firmware-xone-dongle-02f9.bin \
firmware-xone-dongle-02fe.bin \
firmware-xone-dongle-091e.bin \
xone-dongle-firmware"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
bsdtar \
curl \
w3m"

inherit rpm
