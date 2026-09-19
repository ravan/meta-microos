SUMMARY = "Development headers the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the development files for the Access Broker & Resource \
Manager for coordinating access to TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-devel-3.0.0-8.8.aarch64.rpm"
RPM_HASH = "43c866eb638cb933c245a253de5ec3e96a9172721851c950edb8cc6a83b40aff5899909a4695ff595fe87959a86224ded9d406ddaafc15247ad563817233ea28"

RPROVIDES:${PN} += "pkgconfig-tss2-tcti-tabrmd \
tpm2.0-abrmd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libtss2-tcti-tabrmd0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-tss2-mu \
pkgconfig-tss2-sys \
tpm2.0-abrmd"

inherit rpm
