SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-prestring-0.9.0-4.4.noarch.rpm"
RPM_HASH = "d152db5afc74a01d0941f11dae93875f8218b20b5f3afd17b3306fe21582815683465be735b0a9b6fda36bcc067379cb410ad725d2208c2394be2be053b2ba53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-prestring \
python314-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
