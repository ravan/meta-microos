SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python313-musicbrainzngs-0.7.1-3.5.noarch.rpm"
RPM_HASH = "623ff82d48a3844f8a099a04e407805f2ceb3534816700e4b09b956e4a92bab86d73eb26d737ce55c3c485c0ed62b71e512e619f12de4d632fbe56d4e46a9ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-musicbrainzngs \
python3.13dist-musicbrainzngs \
python313-musicbrainzngs \
python3dist-musicbrainzngs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
