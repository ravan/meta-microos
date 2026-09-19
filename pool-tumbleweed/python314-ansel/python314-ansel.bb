SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-ansel-1.0.0-2.13.noarch.rpm"
RPM_HASH = "9eea39e601b49dda1008aeacc466e52c8306d9ba00ccc89b9c462812d7e3015f4f47547a21669dbcc6c13d2ad42b0b3940921724e6737a03d10535939431adb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ansel \
python314-ansel \
python3dist-ansel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
