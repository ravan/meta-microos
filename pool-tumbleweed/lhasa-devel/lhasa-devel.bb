SUMMARY = "Development files for liblhasa, a LHARC decompression library"
DESCRIPTION = "liblhasa is the backend to the Lhasa tool, offering decompressing for \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives. \
 \
This package contains the development headers for the library found \
in liblhasa0."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "lhasa-devel-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "f6e6fddd649349858f57ee8ce1b3b7acfc03e102bf75375ad03969f17f96ba5a3eb7cf659f1fbfdc7fea18872edf16592d18b1bb014a38989205928c5ba9a101"

RPROVIDES:${PN} += "lhasa-devel \
pkgconfig-liblhasa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblhasa0"

inherit rpm
