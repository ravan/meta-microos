SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "14.0.5"

RPM_NAME = "python314-PyChromecast-14.0.5-2.5.noarch.rpm"
RPM_HASH = "002674d729974cb6a3c36404c250855ad0d2ba94a6fed409a6470c5632fb3e1e4f0fadd8e4ad863d3da1525974a47a263fd470138abef544a428db4e7baa3ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pychromecast \
python314-PyChromecast \
python3dist-pychromecast"

RDEPENDS:${PN} += "python-abi \
python314-casttube \
python314-protobuf \
python314-zeroconf"

inherit rpm
