SUMMARY = "Client interface library for tpm2-abrmd"
DESCRIPTION = "This library allows to interact with the tpm2-abrmd daemon. It is intended for \
use with the SAPI library (libtss2-sys) like any other TCTI."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "libtss2-tcti-tabrmd0-3.0.0-8.8.aarch64.rpm"
RPM_HASH = "ff9314ddcc3f021102141106a99145b5d1f73a834bb3866eee86dfd4d945bfdfcc31741e9d2cb09edc81da1cf028b35165d3ebf2ac3c4730f411de5da7a2bfb7"

RPROVIDES:${PN} += "libtss2-tcti-tabrmd.so.0 \
libtss2-tcti-tabrmd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-sys.so.1 \
libtss2-tctildr.so.0"

inherit rpm
