SUMMARY = "IRC to other Chat Networks Gateway (Devel files)"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package contains development files for external plugins."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-devel-3.6-5.11.aarch64.rpm"
RPM_HASH = "c00f45dff9e0e60feac29e5eaf6c1aaba198de6fd157c36dcf1ad6d70a0a82c3c43da14cdb1df15613317e2da544777d8f34f33380f36f7acc425a41025843ef"

RPROVIDES:${PN} += "bitlbee-devel \
pkgconfig-bitlbee"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bitlbee \
pkgconfig-glib-2.0"

inherit rpm
