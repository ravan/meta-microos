SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "2.0.51"

RPM_NAME = "python-SQLAlchemy-doc-2.0.51-1.3.noarch.rpm"
RPM_HASH = "1c7c5e388df366cccb7b84154f485f49160bcf3a46b9ab0150778c64fc73883b47cf8ee6fef51e86ff262e0d94ce0982a00b143d899ef1ef919fde88a37b1826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy-doc \
python313-SQLAlchemy-doc \
python314-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
