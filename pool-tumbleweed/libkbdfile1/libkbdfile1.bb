SUMMARY = "File I/O library for kbd utilities"
DESCRIPTION = "libkbdfile contains file access routines for kbd."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.10.0"

RPM_NAME = "libkbdfile1-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "a2fb79d24ae63d913ae54ee7a3754c31aed1a553088e014fa76c14336f378290f05267b70e856046f03c093604955a9150906132272409f81e7c02d8fd948f6a"

RPROVIDES:${PN} += "libkbdfile.so.1 \
libkbdfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
