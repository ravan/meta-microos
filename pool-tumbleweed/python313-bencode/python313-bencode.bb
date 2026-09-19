SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python313-bencode-4.0.0-2.5.noarch.rpm"
RPM_HASH = "528d9c4073c76e7e3d7974866f02739b1b621041ac126d6d939daa56198b21bb6fd535d1b402ee76dcd0e8dbd133f0000bd0b50b3654c8b4772e3a0ec501dc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bencode \
python3.13dist-bencode.py \
python313-bencode \
python3dist-bencode.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
