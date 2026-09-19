SUMMARY = "A Tool for Sending Fax Documents"
DESCRIPTION = "The sendfax part of mgetty. You can use it instead of hylafax for \
sending faxes. The sources are included in the mgetty source package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "sendfax-1.2.1-14.1.aarch64.rpm"
RPM_HASH = "4325be29b7b2241f56996ebc26878a7d54151746130b788525f139e21a7d9b9734f95523c32ae21a6042f30bab6b22d643a380bac19cac6dbb5ad36177d8c950"

RPROVIDES:${PN} += "config-sendfax \
fax-daemon \
sendfax \
user-fax"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
g3utils \
group-trusted \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
mgetty \
permissions \
shadow"

inherit rpm
