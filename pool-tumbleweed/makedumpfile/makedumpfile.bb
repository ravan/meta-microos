SUMMARY = "Partial kernel dump"
DESCRIPTION = "makedumpfile is a dump program to shorten the size of dump file. It \
copies only the necessary pages for analysis with various dump levels, \
and can compress the page data. The obtained dump file can by analyzed \
via gdb or crash utility."
LICENSE = "GPL-2.0-only"

PV = "1.7.7"

RPM_NAME = "makedumpfile-1.7.7-4.5.aarch64.rpm"
RPM_HASH = "cc2c29057cf2698e25c893ac056fe232b073ddda17a4c4cfdc87a3437caa2804cc168d045ebd67dce60338b690bb5580343aa901766c7d8e0bea5330729627e6"

RPROVIDES:${PN} += "makedumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
liblzo2.so.2 \
libsnappy.so.1 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
