SUMMARY = "Search and download music album covers"
DESCRIPTION = "SACAD is a multi platform command line tool to download album covers \
without manual intervention, ideal for integration in scripts, audio \
players, etc."
LICENSE = "MPL-2.0"

PV = "2.8.0"

RPM_NAME = "sacad-2.8.0-1.8.noarch.rpm"
RPM_HASH = "21a137ddf40c27fa1320bf60b2215b22adae54d660f34b12b565209986271b0aed2444c5163ce95b6e1609cc0142621c9adf0df38657f67f51eced6df4a4680e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-sacad \
python3dist-sacad \
sacad"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Pillow \
python3-Unidecode \
python3-aiohttp \
python3-appdirs \
python3-bitarray \
python3-cssselect \
python3-fake-useragent \
python3-lxml \
python3-mutagen \
python3-tqdm \
python3-web-cache"

inherit rpm
