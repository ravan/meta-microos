SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python314-linetable-0.0.3-2.5.noarch.rpm"
RPM_HASH = "9cc1cfd4641f3c947990366e1afe4687883211c2035afe048c449e3b12b8646b5d29fab3f0fd2bd92ee0cb064f67160cadbb47512d77d3c73ed5529d56de7a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-linetable \
python314-linetable \
python3dist-linetable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
