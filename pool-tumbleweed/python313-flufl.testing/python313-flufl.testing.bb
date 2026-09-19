SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python313-flufl.testing-0.8-3.5.noarch.rpm"
RPM_HASH = "b4876528dcea9600f41f1d2393cd37053d3219ffd7a9e3dab74f230bef24be1876dcc68ff3dbd2a5e7fb119b0b690c179af41262407ffa2358103e0a4b8c6c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.testing \
python3.13dist-flufl.testing \
python313-flufl.testing \
python3dist-flufl.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
