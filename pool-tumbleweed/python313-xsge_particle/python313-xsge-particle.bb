SUMMARY = "xSGE Particles"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides particle effects for SGE."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "python313-xsge_particle-1.0.1-2.5.noarch.rpm"
RPM_HASH = "14f6de1311878beb5412b9492f6251500debd90d5e006d1b31c537041cad7cdd1025ecc3aaf497a9d924be107734ff3038229f484b52ad89fef13fba72a60513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-particle \
python3.13dist-xsge-particle \
python313-xsge-particle \
python3dist-xsge-particle"

RDEPENDS:${PN} += "python-abi \
python313-sge-pygame \
python313-six"

inherit rpm
