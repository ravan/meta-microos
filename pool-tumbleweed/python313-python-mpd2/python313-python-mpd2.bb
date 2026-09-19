SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.1.1"

RPM_NAME = "python313-python-mpd2-3.1.1-1.11.noarch.rpm"
RPM_HASH = "9f771bee93d8e081a5ece190357e3eab02a9fce3b07fa2f76234da8978109bcbb6166bc9b1587bd78e7af5d817a252aa596f929d9579493fe6b4be2f13a62f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpd2 \
python3.13dist-python-mpd2 \
python313-python-mpd2 \
python3dist-python-mpd2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
