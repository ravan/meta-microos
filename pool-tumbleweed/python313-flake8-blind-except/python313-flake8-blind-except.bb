SUMMARY = "A flake8 extension that checks for blind except: statements"
DESCRIPTION = "A flake8 extension that checks for blind except: statements"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-flake8-blind-except-0.2.1-2.5.noarch.rpm"
RPM_HASH = "b8afd9d1b076b57ca965e7a6c049e2430b2c8c2777926f9533a8fadaddbd0fc3101e213ecb44c7fabf66876ef4872a0c302e0670eab99d2b20938281946e92c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-blind-except \
python3.13dist-flake8-blind-except \
python313-flake8-blind-except \
python3dist-flake8-blind-except"

RDEPENDS:${PN} += "python-abi"

inherit rpm
