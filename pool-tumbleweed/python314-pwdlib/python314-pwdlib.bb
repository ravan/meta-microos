SUMMARY = "Modern password hashing for Python"
DESCRIPTION = "Modern password hashing for Python \
 \
**Documentation**: <a href='https://frankie567.github.io/pwdlib/' target='_blank'>https://frankie567.github.io/pwdlib/</a> \
 \
**Source Code**: <a href='https://github.com/frankie567/pwdlib' target='_blank'>https://github.com/frankie567/pwdlib</a>"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-pwdlib-0.3.0-1.5.noarch.rpm"
RPM_HASH = "da6207defb8ce4070a5e5bfe99b66c2ef71556075489ac5431a0a578e21542a9f22fcb75822a67d22ab80faf2e02777e904fb208a9d8e025b46945ba1391f8d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pwdlib \
python314-pwdlib \
python3dist-pwdlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
