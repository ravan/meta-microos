SUMMARY = "A free podcast aggregator for Linux"
DESCRIPTION = "gPodder manages Podcasts for you and automatically downloads selected episodes \
from as many channels as you like. Synchronization support is available for \
iPods and filesystem-based MP3 players, but Podcasts can (of course) also be \
played with any desktop player application."
LICENSE = "GPL-3.0-or-later"

PV = "3.11.5"

RPM_NAME = "gpodder-3.11.5-1.5.noarch.rpm"
RPM_HASH = "e73c9f056b5a6daa2555638220c3b9172f531301e31f0509aadee700ee0e06162c98ec00b5c46837529b5afcbe33d51bfbd01f29bbc93c8f0fb752b25191b131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpodder \
python3.13dist-gpodder \
python3dist-gpodder"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-dbus-python \
python3-eyed3 \
python3-gobject \
python3-mygpoclient \
python3-podcastparser \
python3-requests \
python3-sqlite3 \
typelib-Gtk"

inherit rpm
