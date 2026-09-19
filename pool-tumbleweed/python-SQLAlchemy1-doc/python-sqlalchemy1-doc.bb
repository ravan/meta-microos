SUMMARY = "Documentation for python-SQLAlchemy"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-SQLAlchemy."
LICENSE = "MIT"

PV = "1.4.54"

RPM_NAME = "python-SQLAlchemy1-doc-1.4.54-3.7.noarch.rpm"
RPM_HASH = "02e0989cfb017d7854c393c67e61a2e4fafe57675385a7054189db7d498017edd0b8957c3f010b739a24f688edaaba360afb8a198f7a90de9e3952dd2f7fb78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SQLAlchemy1-doc \
python313-SQLAlchemy-doc \
python314-SQLAlchemy-doc"

RDEPENDS:${PN} += ""

inherit rpm
