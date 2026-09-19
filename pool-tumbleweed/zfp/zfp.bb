SUMMARY = "Read and write numerical arrays"
DESCRIPTION = "Library for compressed numerical arrays that support high \
throughput read and write random access."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "zfp-1.0.1-1.12.aarch64.rpm"
RPM_HASH = "627484c38db677453a1b874f45f13663dec541357fae479616904fba725385314540a329e743ce1c3612c460d7b8807ffae0c44e9c753709bfab71eedfacbb93"

RPROVIDES:${PN} += "zfp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzfp.so.1"

inherit rpm
