SUMMARY = "C library for reading DICOM files"
DESCRIPTION = "libdicom is a C library and a set of command-line tools for reading DICOM WSI files."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libdicom-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "a7972cdee909a3a5698dc10f6e71d80e9b91c9324d1bbf68e580786a05a29f72e94b0c6a2f748a865f9e4cf626d503a0517bb41975cd9e247365dbfcde3d8b7a"

RPROVIDES:${PN} += "libdicom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdicom.so.1"

inherit rpm
