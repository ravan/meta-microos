SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.4.3"

RPM_NAME = "python314-distlib-0.4.3-1.1.noarch.rpm"
RPM_HASH = "eb8cbaa39c4bef540aafd64279b9b686343c07aa56c48b3351c009028415636c83be094293301eb7582deddac857296d2c22d4d3263b6f28f57c0de69d6905e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-distlib \
python314-distlib \
python3dist-distlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
