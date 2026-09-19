SUMMARY = "Safely evaluate AST nodes without side effects"
DESCRIPTION = "Safely evaluate AST nodes without side effects"
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python314-pure-eval-0.2.3-3.1.noarch.rpm"
RPM_HASH = "42995b4037d2145d7e6adfb3ff086f71697bd8d8d6af9b8c052cad48ce1bd1c2ac94d528b0da6383b03980c88fd6a85d784f82e1d3297d71121bbb34cc082965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pure-eval \
python314-pure-eval \
python3dist-pure-eval"

RDEPENDS:${PN} += "python-abi"

inherit rpm
