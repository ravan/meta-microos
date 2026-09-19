SUMMARY = "Library for interfacing with the kernel audit subsystem"
DESCRIPTION = "The libaudit package contains the shared libraries needed for \
applications to use the audit framework."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "libaudit1-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "893ee06ca1b9a7dea110494bfa0654ee55c16bc8aa41c6f2c7cdf9c36baa9401efe8c5cd85c22051f5a6cebfbf1860c9e225b08fb9c8d6afe47c6ad5515344c7"

RPROVIDES:${PN} += "audit-libs \
config-libaudit1 \
libaudit.so.1 \
libaudit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
