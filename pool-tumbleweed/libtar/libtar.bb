SUMMARY = "Tar file manipulation API"
DESCRIPTION = "libtar is a C library for manipulating POSIX tar files. It handles adding \
and extracting files to/from a tar archive."
LICENSE = "BSD-3-Clause"

PV = "1.2.20"

RPM_NAME = "libtar-1.2.20-3.3.aarch64.rpm"
RPM_HASH = "d2a85ae1c8e33fe8d18b3647fd203bf7b3355761e4c735eab65658ced218bc00e5ecff254f87a96d1cb34a499f154ed2546fe43aa77728d29be8b018e821a30f"

RPROVIDES:${PN} += "libtar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtar.so.1 \
libz.so.1"

inherit rpm
