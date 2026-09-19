SUMMARY = "Tool to connect to telepathy IM contacts via SSH"
DESCRIPTION = "SSH-Contact is a client/service tool that makes it easy to connect to \
your telepathy IM contacts via SSH. No need to care about dynamic IP, \
NAT, port forwarding, or firewalls anymore; if you can chat with a \
friend, you can also SSH to their machine."
LICENSE = "GPL-2.0+"

PV = "0.7"

RPM_NAME = "ssh-contact-0.7-9.39.aarch64.rpm"
RPM_HASH = "ee74066c543e68f81eeaa6ce427c7ac0f5f2f9335910e6c8abb7fb0f172d396b6ac1f24ecb119fd8657f5a327f9e1910a4666f8c52f249cffc8361971e94f5bc"

RPROVIDES:${PN} += "ssh-contact"

RDEPENDS:${PN} += "ssh-contact-client \
ssh-contact-service"

inherit rpm
