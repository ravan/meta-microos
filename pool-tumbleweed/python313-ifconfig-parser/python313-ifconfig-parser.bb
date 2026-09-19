SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python313-ifconfig-parser-0.0.5-2.5.noarch.rpm"
RPM_HASH = "2bec12bb356ac23db6eba217672ed1a8d404a03545f9ff256163def21eff99c2560e559d9db273151edfff6cf94fa4d8cc5276c758b59794657d890eaaff9e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ifconfig-parser \
python3.13dist-ifconfig-parser \
python313-ifconfig-parser \
python3dist-ifconfig-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
