SUMMARY = "Partial Implementation of iSNS iSCSI registration"
DESCRIPTION = "This is a partial implementation of the iSNS protocol (see below), \
which supplies directory services for iSCSI initiators and targets. \
 \
The iSNS protocol is specified in \
[RFC 4171](http://tools.ietf.org/html/rfc4171) and its purpose is to \
make easier to discover, manage, and configure iSCSI devices. With \
iSNS, iSCSI targets can be registered to a central iSNS server and \
initiators can be configured to discover the targets by asking the \
iSNS server."
LICENSE = "LGPL-2.1-or-later"

PV = "0.103+4.60de8b5"

RPM_NAME = "open-isns-0.103+4.60de8b5-1.1.aarch64.rpm"
RPM_HASH = "deb04ccab06740b4fd6013886890fba010b1168344dd63d68a2df844ae4343e5d0cd5098912db7607c2778b9abac0fa5dfa9a44ac0622d487d93fb8480b13f8b"

RPROVIDES:${PN} += "config-open-isns \
libisns.so.0 \
open-isns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
systemd"

inherit rpm
