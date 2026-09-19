SUMMARY = "Command Line Interface Tool for XMPP"
DESCRIPTION = "xmppc is a XMPP command line interface client."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.2"

RPM_NAME = "xmppc-0.1.2-1.14.aarch64.rpm"
RPM_HASH = "9ff47d3ec2de564f6d6d54d6874e568f46c8f878457c0d25fd2a0a4f5f0a78ff4ef1fcb6688ec60a3e5ac0358fa5408de2b800ae9a3437df98bce039a82170b7"

RPROVIDES:${PN} += "xmppc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgpgme.so.45 \
libstrophe.so.0"

inherit rpm
