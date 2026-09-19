SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python313-pybeam-0.8.1-1.5.noarch.rpm"
RPM_HASH = "5473e1317f3ad5007fe894eb79db39a576c11aaf228c59faa89a8b8719a864211a22423fa79e862a003d4aee231c312e17050931e1a13b2cf73d84bee917022b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybeam \
python3.13dist-pybeam \
python313-pybeam \
python3dist-pybeam"

RDEPENDS:${PN} += "python-abi \
python313-construct"

inherit rpm
