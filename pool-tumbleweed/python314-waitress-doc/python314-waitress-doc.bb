SUMMARY = "Waitress WSGI server"
DESCRIPTION = "This package contains documentation files for python314-waitress-doc."
LICENSE = "ZPL-2.1"

PV = "3.0.2"

RPM_NAME = "python314-waitress-doc-3.0.2-1.8.noarch.rpm"
RPM_HASH = "8c7b4fca9962f498283ac6ed36c9d1edbdb458a73394351f7cdb0beae0de5b599601587a45c86a86cc71faf2f8606107cd9ba8b90723acddeb4d34b1549b56af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-waitress-doc"

RDEPENDS:${PN} += ""

inherit rpm
