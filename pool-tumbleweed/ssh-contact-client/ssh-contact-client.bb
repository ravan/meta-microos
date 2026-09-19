SUMMARY = "Tool to connect to telepathy IM contacts via SSH -- Client"
DESCRIPTION = "SSH-Contact is a client/service tool that makes it easy to connect to \
your telepathy IM contacts via SSH. No need to care about dynamic IP, \
NAT, port forwarding, or firewalls anymore; if you can chat with a \
friend, you can also SSH to their machine."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ssh-contact-client-0.7-9.39.aarch64.rpm"
RPM_HASH = "831b64be58dbb22f4e659cdcb164f97346f9d2b8b41bfa8038756d183b4810291568a76f79d26be3f49bbd81e6010f19e63ad51ff5bcd1d40f2451beb89ae1da"

RPROVIDES:${PN} += "ssh-contact-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
