SUMMARY = "XMPP HTTP File Upload plugin for libpurple"
DESCRIPTION = "A XEP-0363: HTTP File Upload plugin for libpurple (Pidgin, Finch)."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "libpurple-plugin-xmpp-http-upload-0.2.4-1.17.aarch64.rpm"
RPM_HASH = "2da71427973b7451fcdf77fd80b9debb643a65c6c36e366040cd5ebf5753cbd2ff4e5fbbcc6c98ec2d2115a48f0c132d8049b37d1a95fcbe198dbeeaad9918d3"

RPROVIDES:${PN} += "libjabber-http-file-upload.so \
libpurple-plugin-xmpp-http-upload"

RDEPENDS:${PN} += "libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libjabber.so.0 \
libpurple.so.0"

inherit rpm
