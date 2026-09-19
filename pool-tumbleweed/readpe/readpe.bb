SUMMARY = "Text-based tool to analyze PE files"
DESCRIPTION = "A tool to get information of PE32/PE32+ executables (EXE, DLL, OCX, ...) \
like headers, sections, resources and more."
LICENSE = "GPL-2.0-only"

PV = "0.85.1"

RPM_NAME = "readpe-0.85.1-1.6.aarch64.rpm"
RPM_HASH = "50a8bd49f787c5ddb52905c93636484c9e950771fde585a4fd72281bade7779f2860c9409cf1756cf9d5fd60ea0291cf52e823f46d896f619d281f99dce0c5fd"

RPROVIDES:${PN} += "bundled-udis86 \
readpe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpe.so.1"

inherit rpm
