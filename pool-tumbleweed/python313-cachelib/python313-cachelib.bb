SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python313-cachelib-0.13.0-1.3.noarch.rpm"
RPM_HASH = "6b30046e07c85db926ddd469ae8b612985c40011f6bd0bf60b8b562074626f123e786b2ec5cb56fc499726ce1a19e25efc8b520f4189e15c75262d05841e99a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachelib \
python3.13dist-cachelib \
python313-cachelib \
python3dist-cachelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
