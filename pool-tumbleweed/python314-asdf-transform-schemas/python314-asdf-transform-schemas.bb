SUMMARY = "ASDF schemas for transforms"
DESCRIPTION = "ASDF schemas for transforms"
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python314-asdf-transform-schemas-0.6.0-1.6.noarch.rpm"
RPM_HASH = "27f18cbd46a0d343136630954c6656ec7da948712b48e0b4eeb88e22a5bc0116bf94c26a95fc02c61b4355f16a7e5f1116c6f87a7e602032a978c34a1f73c54f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asdf-transform-schemas \
python314-asdf-transform-schemas \
python3dist-asdf-transform-schemas"

RDEPENDS:${PN} += "python-abi \
python314-asdf-standard"

inherit rpm
