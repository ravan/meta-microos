SUMMARY = "Python reader/writer for the DiffX file format"
DESCRIPTION = "A Python implementation of a reader and writer for the DiffX file \
format, an extension to the unified diff format that adds structured, \
unambiguous metadata for multi-commit, multi-file diffs."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python313-pydiffx-1.1-1.2.noarch.rpm"
RPM_HASH = "65d173dfb5e71bd977f25c7be1260a23d002e4d594ec514c7d50be69b8e9250173435e436cc4de81187f83c257670e92db341596e53fccee1d2f04d9ef0ef478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydiffx \
python3.13dist-pydiffx \
python313-pydiffx \
python3dist-pydiffx"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
