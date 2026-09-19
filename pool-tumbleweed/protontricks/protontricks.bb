SUMMARY = "Winetricks for Proton-enabled Games"
DESCRIPTION = "A simple wrapper that does winetricks things for Proton enabled games."
LICENSE = "GPL-3.0-only"

PV = "1.14.1"

RPM_NAME = "protontricks-1.14.1-1.4.noarch.rpm"
RPM_HASH = "4c2dc6a22a2f5a573aa12e9eaaa934de7d18355c3eca838c7b6f5bdffd178a7a5a958565f4b6ca9d3e2040c41f6e8eaa2c92d2b1a0cb821d769f11d0f3e102e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protontricks \
python3.13dist-protontricks \
python3dist-protontricks"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
python-abi \
python3-Pillow \
winetricks"

inherit rpm
