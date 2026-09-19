SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python313-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "3.0.2"

RPM_NAME = "python313-waitress-doc-3.0.2-1.8.noarch.rpm"
RPM_HASH = "dede8136d7deb33c03bbe608b401bec73b3a59b4e9d5080c0fbea859756ab2cbd297dea9270282a7ee900920e56875a4e96de4203d1d21eade7821b023966fc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress-doc \
python313-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
