SUMMARY = "A decompression library for the LHARC data format"
DESCRIPTION = "liblhasa is the backend to the Lhasa tool, offering decompressing for \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "liblhasa0-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "9d3b184e5eb022ccdd28784a6e79368024b67c0ac58ac32fac665e9a65edfd75ada291d6cbf6c9b8a022e3a1f8cf0569bee76e0206898daf24b334e4652b2dfd"

RPROVIDES:${PN} += "liblhasa.so.0 \
liblhasa0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
