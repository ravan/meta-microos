SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python314-Yapsy-1.12.2-5.5.noarch.rpm"
RPM_HASH = "cbd6268030ddbabf16f92b30572985f24f16abe9d2a7b2d6deae6d99dbbad0c3bcd9f4cba0fee886cf5a4fd0d804f619418aa2afbdfbce1572b765c2b2d875a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yapsy \
python314-Yapsy \
python314-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
