SUMMARY = "Displays information contained in .torrent Files"
DESCRIPTION = "TorrentInfo is a command line script that parses .torrent files and displays \
the information contained within them. Currently, it can display a summary \
of the whole torrent, information on each file within the torrent, and a \
full hierarchical dump of the torrent file's contents."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.7"

RPM_NAME = "torrentinfo-1.8.7-3.1.noarch.rpm"
RPM_HASH = "f344e7249438afc37535bc748714b4e4c95b3e856e2e8ede917915ca24b7d9954383f853f7c6a8a975e0818ae9664c6823944b22d6f1e3c5351050ce505009ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-torrentinfo \
python3dist-torrentinfo \
torrentinfo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
