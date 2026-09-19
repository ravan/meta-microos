SUMMARY = "Edge Addition Planarity Suite main library"
DESCRIPTION = "EAPS provides implementations of the edge addition planar graph \
embedding algorithm and related algorithms."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0.0"

RPM_NAME = "libplanarity4-5.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "e53483b77534762d99eced20ed758100c483e9f13a865fd8c46fb81120314ccaa92f1b76a32b26dd18fc6f8365b68605bff5720fb9fdbc2ed0bbdf84a63f4174"

RPROVIDES:${PN} += "libplanarity.so.4 \
libplanarity4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
