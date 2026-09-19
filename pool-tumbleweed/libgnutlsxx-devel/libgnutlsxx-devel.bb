SUMMARY = "Development package for the GnuTLS C++ API"
DESCRIPTION = "Files needed for software development using gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.13"

RPM_NAME = "libgnutlsxx-devel-3.8.13-3.1.aarch64.rpm"
RPM_HASH = "1f4b348a5d1f5c88a074137dbb9d9a5556118267dbaf9b7ef28aa699ecffcb04785ed7723c5999cf24972355ff65f4bf237fef3fca1df0ba1cdf51c79ee866ef"

RPROVIDES:${PN} += "libgnutlsxx-devel"

RDEPENDS:${PN} += "libgnutls-devel \
libgnutlsxx30 \
libstdc++-devel"

inherit rpm
