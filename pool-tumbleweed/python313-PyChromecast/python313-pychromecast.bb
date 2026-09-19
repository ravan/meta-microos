SUMMARY = "Python module to talk to Google Chromecast"
DESCRIPTION = "Library to communicate with the Google Chromecast. It currently supports \
Auto discovering connected Chromecasts on the network, start the default \
media receiver and play any online media, control playback of current \
playing media, implement Google Chromecast api v2, communicate with apps \
via channels, easily extendable to add support for unsupported namespaces, \
multi-room setups with Audio cast devices."
LICENSE = "MIT"

PV = "14.0.5"

RPM_NAME = "python313-PyChromecast-14.0.5-2.5.noarch.rpm"
RPM_HASH = "8d37b7ee7adf7004e61522aa1dc6024879e6feadf23a257c25d1ae65a2cdf94db58f052b08b3325556256183ac8aac4314556ad23e506cabf87fc7432ee833c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyChromecast \
python3.13dist-pychromecast \
python313-PyChromecast \
python3dist-pychromecast"

RDEPENDS:${PN} += "python-abi \
python313-casttube \
python313-protobuf \
python313-zeroconf"

inherit rpm
