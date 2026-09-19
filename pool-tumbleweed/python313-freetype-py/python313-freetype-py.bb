SUMMARY = "Freetype python bindings"
DESCRIPTION = "Freetype python provides bindings for the FreeType library. \
Only the high-level API is bound."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python313-freetype-py-2.5.1-1.9.noarch.rpm"
RPM_HASH = "836bfa874c44ed2bbf2d897a39f6b18e80b372602612bdf0962406fc36afe63b04194c12ea6cae97bb53dfcb83903764bd746ed9bebff36ecea3fd06e04d5c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freetype-py \
python3.13dist-freetype-py \
python313-freetype-py \
python3dist-freetype-py"

RDEPENDS:${PN} += "freetype2 \
python-abi"

inherit rpm
