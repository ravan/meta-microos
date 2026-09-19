SUMMARY = "C library for reading DICOM files"
DESCRIPTION = "libdicom is a C library and a set of command-line tools for reading DICOM WSI files."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libdicom1-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "8998cc664916e629170ea842be63713263ab24b6a7b10cb7754468542d3d40e8a764348268c40b79544652eab9323296ac0f13fd1385fce103dc34f261f39477"

RPROVIDES:${PN} += "libdicom.so.1 \
libdicom1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
