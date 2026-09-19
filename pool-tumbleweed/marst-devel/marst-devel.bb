SUMMARY = "Development files for marst, an Algol-to-C translator"
DESCRIPTION = "MARST is an Algol-to-C translator. It automatically translates programs written \
on the algorithmic language Algol 60 to the C programming language. \
 \
This package contains the files needed to develop using marst."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "marst-devel-2.8-1.5.aarch64.rpm"
RPM_HASH = "f7a24629b9a56daaa91eab7c80a86cc06ef5b4d76b557dea70a70a59b831472a1e930aa3d102788db2c399e235f68a2d78b361a991f1286b82c5ece1c70a5a47"

RPROVIDES:${PN} += "marst-devel"

RDEPENDS:${PN} += "libalgol0"

inherit rpm
