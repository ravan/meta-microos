SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python314-freetype-py-2.5.1-1.9.noarch.rpm"
RPM_HASH = "8e0103dc7e9c50a0b319d7b93c4c11637466676c1d83f57531bd6aecff990c28084f3be1977a4d1acc61d4abe64de4f177b7037ed0ce7980d3b9e3395f674a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-freetype-py \
python314-freetype-py \
python3dist-freetype-py"

RDEPENDS:${PN} += "freetype2 \
python-abi"

inherit rpm
