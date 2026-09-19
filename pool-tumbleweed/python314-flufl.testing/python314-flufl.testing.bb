SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python314-flufl.testing-0.8-3.5.noarch.rpm"
RPM_HASH = "71471a1dec630885067f83486a9df5cd4479ac413560207e50ab3afca7ea6620c58883617917054bfc9a2ebffcef1fa12a8d36cb916e51ffe77b5647a16ff308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flufl.testing \
python314-flufl.testing \
python3dist-flufl.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
