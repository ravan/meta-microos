SUMMARY = "A Wrapper to Securely Run Insecure or Untrusted Programs"
DESCRIPTION = "Compartment provides all possibilities (chroot, kernel capabilities) \
for securely running insecure or untrusted programs. It provides all \
necessary options to fine-tune the security tightening process as \
needed. \
 \
 \
 \
Authors: \
-------- \
    Marc Heuse <marc@suse.de>"
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "compartm-1.1-458.9.aarch64.rpm"
RPM_HASH = "544405737580df627a0457db53b197b2ee1fe26e7611f91c930ef7e0026accc5a0a90756fd1bea355c767250e02c10a56a90ae06d343bf52681fbcde12a774ae"

RPROVIDES:${PN} += "compartm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
