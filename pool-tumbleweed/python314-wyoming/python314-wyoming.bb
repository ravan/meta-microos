SUMMARY = "Peer-to-peer protocol for voice assistants"
DESCRIPTION = "Peer-to-peer protocol for voice assistants"
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "python314-wyoming-1.5.4-2.9.noarch.rpm"
RPM_HASH = "84adc4be8b97265b4099fc71d8ca001d1b06dbb4923cd15a268d5a9af53083ca87658c7034ccd0cb69ae573437e8c9ddadbb32ac371a74068e635c990b7e8a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wyoming \
python314-wyoming \
python3dist-wyoming"

RDEPENDS:${PN} += "python-abi"

inherit rpm
