SUMMARY = "Python API to talk to kanidm"
DESCRIPTION = "Python API to talk to kanidm."
LICENSE = "MPL-2.0"

PV = "1.10.4~git0.97b1edbc4"

RPM_NAME = "python313-pykanidm-1.10.4~git0.97b1edbc4-1.2.aarch64.rpm"
RPM_HASH = "197036028ea16ff7f06985af908bb28f1760552958c32bcf2a8ac233f28b09b8f27d636e0e5c417e065d69fdd07c13be6e7c73b791d54ecda544ceffec84e593"

RPROVIDES:${PN} += "python3.13dist-kanidm \
python313-pykanidm \
python3dist-kanidm"

RDEPENDS:${PN} += "python-abi \
python313-Authlib \
python313-aiohttp \
python313-pydantic \
python313-toml"

inherit rpm
