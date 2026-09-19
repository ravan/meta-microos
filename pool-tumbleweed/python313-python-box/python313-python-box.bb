SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "7.3.2"

RPM_NAME = "python313-python-box-7.3.2-1.5.noarch.rpm"
RPM_HASH = "fad5cda4e8c51f91b74ab00f663675debda3884f1029ff84d7c2160c86ba139e30f1fd8d6426c6a9df218a8d9874858f07fa542ace5a6cc8d9acc69e771a4343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-box \
python3.13dist-python-box \
python313-python-box \
python3dist-python-box"

RDEPENDS:${PN} += "python-abi"

inherit rpm
