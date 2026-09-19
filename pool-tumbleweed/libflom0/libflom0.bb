SUMMARY = "Distributed lock manager library"
DESCRIPTION = "FLoM is a distributed lock manager that can be used to \
synchronize shell commands, scripts and custom developed software. \
 \
This package contains the shared library."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "libflom0-1.6.1-2.11.aarch64.rpm"
RPM_HASH = "f09ccf940c0993b1bd06d105bb1f1d7f85a2d926af25e02ab46a2d2c76461a143c67724d878aa5de4315d74147fee85846effa69ce7958833cb9d927a37b57b1"

RPROVIDES:${PN} += "libflom.so.0 \
libflom0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libssl.so.3"

inherit rpm
