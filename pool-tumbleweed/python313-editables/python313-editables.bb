SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python313-editables-0.6-1.2.noarch.rpm"
RPM_HASH = "dba9773a9f9cac5f213bf1dd9533e2ec467fe20a6bc19bd221d4c252cffc65cae44b96c97172c72bd5465c5a6e1bc79c1d06405be19a9c895d5fa03f1c2f7435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-editables \
python3.13dist-editables \
python313-editables \
python3dist-editables"

RDEPENDS:${PN} += "python-abi"

inherit rpm
