SUMMARY = "A Program to get and set hard disk parameters"
DESCRIPTION = "A shell utility to access and tune the ioctl features of the Linux IDE \
driver and IDE drives."
LICENSE = "SUSE-Permissive"

PV = "9.65"

RPM_NAME = "hdparm-9.65-3.9.aarch64.rpm"
RPM_HASH = "423b2280d906fbedac4ab72cb7dfc1a3cd14cc7ada420d94ed57679c45a546936db68b1d90d18ac2c7f8f1a778eec8b3f5eed6bf520531d14f367dc61fb52053"

RPROVIDES:${PN} += "base-/sbin/hdparm \
hdparm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
