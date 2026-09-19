SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "python314-testresources-2.1.2-1.3.noarch.rpm"
RPM_HASH = "d56877aece939cec05a3b340e15f6eafcb956f5a5c1791911222a26718736c8645298e8a5a361e5ee81738d0b14a063ef381802f617f485a7393a53462c35740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testresources \
python314-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
