SUMMARY = "libreport's bugzilla plugin"
DESCRIPTION = "Plugin to report bugs into the bugzilla."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-plugin-bugzilla-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "ad69457a1e7daf30e673e4a6c6d11f7b5608a1e3c949d9c51915894d993f834203557184b6cb9c90bd3842456375102f134ef153b592527f65def8c1518d3c36"

RPROVIDES:${PN} += "config-libreport-plugin-bugzilla \
libreport-plugin-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreport-2 \
libreport-web-2 \
libreport-web.so.2 \
libreport.so.2 \
libxmlrpc-client.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3 \
python3-libreport"

inherit rpm
