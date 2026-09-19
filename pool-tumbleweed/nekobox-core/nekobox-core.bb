SUMMARY = "NekoBox core (sing-box with enchancements)"
DESCRIPTION = "NekoBox core (sing-box with enchancements)"
LICENSE = "GPL-3.0-only"

PV = "5.11.28.2"

RPM_NAME = "nekobox-core-5.11.28.2-1.1.aarch64.rpm"
RPM_HASH = "2dc9c4cb5c7da041c5a6779646c157f4344e1558b1063333f9cdc56bf177277b21c9c922235ba279e6122142753aacfbd1483f20a22ab7c0e205cabeec7e4532"

RPROVIDES:${PN} += "nekobox-core \
sing-box"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
