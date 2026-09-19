SUMMARY = "Aeronautical fonts designed for cockpits"
DESCRIPTION = "B612 is a legible font family designed and tested to be used on aircraft \
cockpit screens. \
 \
This contains the B612 font family with patches from SUSE's \
William Brown adjusting some characters for better readability."
LICENSE = "OFL-1.1 & EPL-2.0 & BSD-3-Clause"

PV = "4.20.69"

RPM_NAME = "firstyear-b612-fonts-4.20.69-1.6.noarch.rpm"
RPM_HASH = "80245bd86a48739339eaabe221d4847f01e3cd9c304e1ab7ef2e8a9c34755013ef818d00101b84edd1eab1e53e36e700cbb581e68dfeccc6e9c0af309061350c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firstyear-b612-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
