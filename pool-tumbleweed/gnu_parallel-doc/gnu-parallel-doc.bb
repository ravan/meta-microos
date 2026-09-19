SUMMARY = "Documentation for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the documentation for Parallel."
LICENSE = "CC-BY-SA-3.0 & GFDL-1.3-only"

PV = "20260822"

RPM_NAME = "gnu_parallel-doc-20260822-1.1.noarch.rpm"
RPM_HASH = "82f7b4f7db6f7d09c186652d7aff7cfacf51295bec0914d012029189d9ca1545f2f16989888d2d8b9027eafebdf14a2deba2977436cb160784653d46f2dfc6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-doc"

RDEPENDS:${PN} += ""

inherit rpm
