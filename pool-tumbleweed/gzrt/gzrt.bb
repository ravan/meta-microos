SUMMARY = "Recover data from a corrupted gzip file"
DESCRIPTION = "gzrecover is a program that will attempt to extract any readable data \
out of a gzip file that has been corrupted."
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "gzrt-0.8-2.23.aarch64.rpm"
RPM_HASH = "57f06dceba98cb0baa7e0def02756fcc67b17b1f783b232e43ea7fb27ddcd76f159aeb075a0e33b5993fe90f9cbd3e399b594d0ab6d25266fd71d661b7687b8f"

RPROVIDES:${PN} += "gzrt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
