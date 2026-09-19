SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.11"

RPM_NAME = "python313-podcastparser-0.6.11-1.4.noarch.rpm"
RPM_HASH = "2fde4d24cd97777b7472aa889b14200796d61a5bb9425be0ef3076a408680cf5ed1574e492aca89ee800df3d4db66bb88298939c72dcbe7fcb672468ac200b7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podcastparser \
python3.13dist-podcastparser \
python313-podcastparser \
python3dist-podcastparser"

RDEPENDS:${PN} += "python-abi \
python313-xml"

inherit rpm
