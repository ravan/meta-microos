SUMMARY = "Application and environment virtualization"
DESCRIPTION = "Apptainer provides functionality to make portable \
containers that can be used across host environments."
LICENSE = "BSD-3-Clause-LBNL & OpenSSL"

PV = "1.5.3"

RPM_NAME = "apptainer-1.5.3-3.1.aarch64.rpm"
RPM_HASH = "e7bc94d32c9fadbc4f1e4f8e47d2bc08d957c3ba4d17013838ac6ff40af7418d1564c3bab98c7b755c091652f6890c13cc92576f661543282da01bee946f608a"

RPROVIDES:${PN} += "apptainer \
config-apptainer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libseccomp.so.2 \
permissions \
squashfs \
squashfuse"

inherit rpm
