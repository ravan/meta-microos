SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-bpf-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "925b50d332d01c4de20b0ee41bcd69787fbc38a06938106ebeb8c5abe5f4712f2dd09c382cceda51222192e1913d5b4c551633f969628be86525cd6b12d08f3d"

RPROVIDES:${PN} += "bpf-none-gcc \
cross-bpf-gcc13"

RDEPENDS:${PN} += "cross-bpf-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
