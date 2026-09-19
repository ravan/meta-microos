SUMMARY = "Package provides recommended R-lattice"
DESCRIPTION = "This packages provides R-lattice, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.22.9"

RPM_NAME = "R-lattice-0.22.9-58.3.aarch64.rpm"
RPM_HASH = "5508d5bb195db529aa23783092c662300b7ab50228edff48a7decf64196e3140ee7f7c70ac345fc94e7c4d636673772c09621fa3a17c122430c261a34e8ed900"

RPROVIDES:${PN} += "R-lattice"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
