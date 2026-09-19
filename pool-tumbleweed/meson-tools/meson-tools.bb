SUMMARY = "Utilities for Amlogic SoCs"
DESCRIPTION = "Utilities for working with Amlogic 'Meson' SoCs"
LICENSE = "GPL-2.0+ & MIT"

PV = "0.1"

RPM_NAME = "meson-tools-0.1-1.35.aarch64.rpm"
RPM_HASH = "1dfbb721bd7b710a99db4ad496b4f80e5c1630fe887a18bd26d515b5542c97b2bbbbe012ebe454d510aec017d3526525d0adcdd482a379ffa3326fb2bba51a75"

RPROVIDES:${PN} += "meson-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
