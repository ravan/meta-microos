SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libibnetdisc5-63.0-1.3.aarch64.rpm"
RPM_HASH = "3cd89834aefade661339d17fcb7a7c6ed5ca1459699d9514dcfab7c43a87ec34af22dc848ad6472b63f6325f931ce5b1d04a9017e1a2098025e85cee92ed05df"

RPROVIDES:${PN} += "libibnetdisc.so.5 \
libibnetdisc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
