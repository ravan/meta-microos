SUMMARY = "Atomic transactions for TinyDB"
DESCRIPTION = "Atomic transactions for TinyDB."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-tinyrecord-0.2.0-3.5.noarch.rpm"
RPM_HASH = "883592e2bf0d0249eba54fa2a50354c5067929b31fffb5937023fa3ee3240828e3dab8dc7bbc4fde1893c2465bb33d9b2d423a06c8bf77ec3c65f75df6f43e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tinyrecord \
python3.13dist-tinyrecord \
python313-tinyrecord \
python3dist-tinyrecord"

RDEPENDS:${PN} += "python-abi \
python313-tinydb"

inherit rpm
