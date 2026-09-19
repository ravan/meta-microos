SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "wireless-tools-30.pre9-41.9.aarch64.rpm"
RPM_HASH = "ce003d120409efed92fcda7c2c5b5540c2e0961c13dfa92a6a5a0be4fbebe02d9b418f108ab07cb64ae5b48234c7c92aecd06e76353ec2a6a22b5fee126790b2"

RPROVIDES:${PN} += "wireless-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libiw \
libiw.so.30 \
libm.so.6"

inherit rpm
