SUMMARY = "GAP: toric varieties and some combinatorial geometry computations"
DESCRIPTION = "'toric' is a package that implements some computations related to \
toric varieties and combinatorial geometry in GAP. With 'toric', \
affine toric varieties can be created and related information about \
them can be calculated. 'toric' is written entirely in the GAP \
language by D. Joyner."
LICENSE = "MIT"

PV = "1.9.6"

RPM_NAME = "gap-toric-1.9.6-1.6.noarch.rpm"
RPM_HASH = "2b941a5ce1374f6fc08687f0b86196f7cf257e043768f6cb6e58d3f3589fc85f9b62f55f6b5012bfec154cb8a2a0353f7945ef881d1a2d3709b049cf85d1d3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-toric"

RDEPENDS:${PN} += "gap-core"

inherit rpm
