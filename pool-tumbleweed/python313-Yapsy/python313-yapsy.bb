SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python313-Yapsy-1.12.2-5.5.noarch.rpm"
RPM_HASH = "4c1fee0b0a5022117c1ae4ec10cba271065a3e866238666ba37c616f392c691303d60b1cebc64a6cde29ed3aa684635e89588f255dbdbb7551e83a8ebdb7628f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Yapsy \
python3-yapsy \
python3.13dist-yapsy \
python313-Yapsy \
python313-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
