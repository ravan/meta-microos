SUMMARY = "DMZ Cursor Theme"
DESCRIPTION = "This package contains the DMZ cursor theme for X."
LICENSE = "CC-BY-SA-3.0"

PV = "11.4.0"

RPM_NAME = "dmz-icon-theme-cursors-11.4.0-1.7.noarch.rpm"
RPM_HASH = "7775e628ab5c6aa9a91debcedcddea35733677739380ac13979815df5b999c08290c3debb08ee8bde318b760cdd9b5af48a1889cb7e4ec1acf6d0c0b383fe805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dmz-icon-theme-cursors \
icon-theme-dmz-cursors"

RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
