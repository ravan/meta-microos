SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python313-simplekml-1.3.6-2.5.noarch.rpm"
RPM_HASH = "6f703188da843460edc43a6bf8ba74477e58bc53e4d31b0954a88257c1b2a1e2c796ae93c1c691f9dac380bc2b21173d61bf85ecb9e34ffaa7239bb1375b8f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplekml \
python3.13dist-simplekml \
python313-simplekml \
python3dist-simplekml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
