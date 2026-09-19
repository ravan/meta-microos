SUMMARY = "Documentation for python-mpi4py"
DESCRIPTION = "Documentation files and demos for python-mpi4py."
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python-mpi4py-doc-4.1.2-1.2.noarch.rpm"
RPM_HASH = "faa25daa16fbea8b82f1bf4d54f43a322f9d705a915b4c70a76496d38752ebff24c263743175db699cf4f58b489857de4200383cb7bea374235371eb11a5d7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mpi4py-doc \
python313-mpi4py-doc \
python314-mpi4py-doc"

RDEPENDS:${PN} += ""

inherit rpm
