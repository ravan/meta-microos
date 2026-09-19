SUMMARY = "VDE ecryption module"
DESCRIPTION = "This package contains CryptCab, which can be used \
to send encrypted data over an UDP link."
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "vde2-cryptcab-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "9f165b95f65cea819f12f1832af57f647bfccade8d8a6280649741d111b0fbd0a3eb2174472303b04b101573b670be5420e192c6d745beb34547049428201031"

RPROVIDES:${PN} += "vde2-cryptcab"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libvdeplug.so.3"

inherit rpm
