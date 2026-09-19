SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python314-bencode-4.0.0-2.5.noarch.rpm"
RPM_HASH = "4c1a96770238cb77edcbf6ee52d297b610df4a8aa2a0c35f336f0096571afb6ee5e39a841888014e9a89f24427d4de44ccd237f96c2475fc9788750600222932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bencode.py \
python314-bencode \
python3dist-bencode.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
