SUMMARY = "Tool to connect to telepathy IM contacts via SSH -- Server"
DESCRIPTION = "SSH-Contact is a client/service tool that makes it easy to connect to \
your telepathy IM contacts via SSH. No need to care about dynamic IP, \
NAT, port forwarding, or firewalls anymore; if you can chat with a \
friend, you can also SSH to their machine."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ssh-contact-service-0.7-9.39.aarch64.rpm"
RPM_HASH = "3c8b5df942c45348828c16921e3fabc66b701a1d50c62c0328c802a5fb8e4ea61afeb67f607167a468484d00ce6332fd5f56d5ddc4adc7617651ff804ee02336"

RPROVIDES:${PN} += "ssh-contact-service"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
