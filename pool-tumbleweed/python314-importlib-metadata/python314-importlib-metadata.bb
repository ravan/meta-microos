SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "9.0.1"

RPM_NAME = "python314-importlib-metadata-9.0.1-1.1.noarch.rpm"
RPM_HASH = "b62ac4d28400e1bbf1f78cccef42d7dbb79638bc0af79280f1b16d0be098a15cc20ca708d9572b2970ecdddba8cde8740efa73d654350859d3c1968f9b09f960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-importlib-metadata \
python314-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python314-zipp"

inherit rpm
