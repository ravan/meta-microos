SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-dragonmapper-0.3.0-1.9.noarch.rpm"
RPM_HASH = "3797af6106cfcb524cf7e97b506ee39aaaa3a7d0a172be07487e64ae09e9b9dacc4ca2eff73cded30bf63739e38f58b8cac91edbba0b5cdd594bd5c0c8ebfdc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dragonmapper \
python3.13dist-dragonmapper \
python313-dragonmapper \
python3dist-dragonmapper"

RDEPENDS:${PN} += "python-abi \
python313-hanzidentifier \
python313-zhon"

inherit rpm
