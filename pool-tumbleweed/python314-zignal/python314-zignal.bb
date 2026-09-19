SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python314-zignal-0.7.0-1.10.noarch.rpm"
RPM_HASH = "afd219dcf590f00e9643d4538f005893e771fe5a40eae858be0cf566e64b62196c17a33f4181a4dca7deb96488c977f5a1e5c5fcc1cf9f402ad694f7bae2b231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zignal \
python314-zignal \
python3dist-zignal"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-matplotlib \
python314-numpy \
python314-samplerate \
python314-scipy \
update-alternatives"

inherit rpm
