SUMMARY = "A Simple KML creator"
DESCRIPTION = "The python package simplekml was created to generate kml (or kmz). \
It was designed to alleviate the burden of having to study KML in order to \
achieve anything worthwhile with it. \
If you have a simple understanding of the structure of KML, then simplekml \
is easy to run with and create usable KML."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.6"

RPM_NAME = "python314-simplekml-1.3.6-2.5.noarch.rpm"
RPM_HASH = "3018fe233c40fe78bc4d40bc3dcca075b5f783acd4e6de4c82252c11ca6a06ca3d52adcff9b69f383a66ada1f7b85ca4ec2fe28db1fd48371122de5416b8188d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-simplekml \
python314-simplekml \
python3dist-simplekml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
