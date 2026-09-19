SUMMARY = "Peer-to-peer protocol for voice assistants"
DESCRIPTION = "Peer-to-peer protocol for voice assistants"
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "python313-wyoming-1.5.4-2.9.noarch.rpm"
RPM_HASH = "8331ddf9e8c554099479ff584c8b8f9f40bb35f366756301ad5679bb73b075c17903d382c7221e5a104540e716277aec609bab1aeb6051c10a78ed3e7f59dcdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wyoming \
python3.13dist-wyoming \
python313-wyoming \
python3dist-wyoming"

RDEPENDS:${PN} += "python-abi"

inherit rpm
