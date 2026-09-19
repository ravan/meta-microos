SUMMARY = "Utility to list X resources in widgets"
DESCRIPTION = "The listres program generates a list of X resources for a widget \
in an X client written using a toolkit based on libXt."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "listres-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "7f13d64554cc8e6ff88aed2abb4d789ce6a50ccb707976f44c41a91436aead83600a84516affd037e56986718d4b7e307b33305ee6e05fa18e446a89442fd4f4"

RPROVIDES:${PN} += "listres"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
