SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmidetect library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "libipmidetect0-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "30d45ff4d8404a744c5f3a1be09cad35f79709f79cb09311ef9673a0d7c2faabbc7dddcf8f569fd603f5ec5bccc787c52fd1b919bf6213f7b2943824ef71babf"

RPROVIDES:${PN} += "libipmidetect.so.0 \
libipmidetect0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
