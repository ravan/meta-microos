SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.1.1"

RPM_NAME = "python314-python-mpd2-3.1.1-1.11.noarch.rpm"
RPM_HASH = "857489f8e6b25afa99c2233c0a5f4cef2234374f8e8af1c427b538dd919f4cdd66f763aa979e6437973b9e4e05530fbcc9735a9748c382e83b14cc7d89eb83ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-mpd2 \
python314-python-mpd2 \
python3dist-python-mpd2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
