SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python314-pyleri-1.5.1-1.1.noarch.rpm"
RPM_HASH = "6cef825242a40568504886297cbafe9c2a6d5da3db38a88ab4a480349832668fa4d74ca41869a8e137c6a71d535a93712755257e1bac44bed1219ebb7e474b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyleri \
python314-pyleri \
python3dist-pyleri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
