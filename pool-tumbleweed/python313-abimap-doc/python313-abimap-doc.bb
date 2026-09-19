SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python313-abimap"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-abimap-doc-0.4.0-1.5.noarch.rpm"
RPM_HASH = "54e52465e308e83476e84f0dc6cdc6ee9a69927dbe8026bcdeace48988bb224fdb61bbe1df0c0d5908deda8607caad1bb3f92f62c155b1b1cc7784be3628d90f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abimap-doc \
python313-abimap-doc"

RDEPENDS:${PN} += ""

inherit rpm
