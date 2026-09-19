SUMMARY = "Whatsapp Desktop for Linux"
DESCRIPTION = "WhatsApp desktop application for Linux."
LICENSE = "GPL-3.0-only+"

PV = "6.4.0"

RPM_NAME = "zapzap-6.4.0-1.2.noarch.rpm"
RPM_HASH = "2d6e8388f2dd4a942e5a3f1350257fbd9f808cdb41dd6e6313b74067f9d416688553d9ab5ceda1ea98927ead498babdc4e02e6bbc433e3a9f0eec758fa7d9639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-zapzap \
python3dist-zapzap \
zapzap"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyQt6-WebEngine \
python3-PyQt6-sip \
python3-dbus-python"

inherit rpm
