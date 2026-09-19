SUMMARY = "ASN.1 parsing tools"
DESCRIPTION = "This package contains various utilities for parting ASN.1 data."
LICENSE = "GFDL-1.3-or-later & GPL-3.0-or-later"

PV = "4.21.0"

RPM_NAME = "libtasn1-tools-4.21.0-1.5.aarch64.rpm"
RPM_HASH = "488f339a0ba48197fc0a6fbeecf4450be438e0f0c2454c14a9faecf30d5b9c1f7e6fb9187ef5d4f5b8a56a7fd6899dd633d3397fda3a871f19586104fb8bef22"

RPROVIDES:${PN} += "libtasn1 \
libtasn1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtasn1.so.6"

inherit rpm
