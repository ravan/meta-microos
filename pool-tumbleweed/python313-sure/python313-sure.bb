SUMMARY = "Utility belt for automated testing in python for python"
DESCRIPTION = "A testing library for python with powerful and flexible assertions. Sure is \
heavily inspired by should.js"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.1"

RPM_NAME = "python313-sure-2.0.1-4.4.noarch.rpm"
RPM_HASH = "0c7a94deffd76530c0b6337b25634414c9b9cbd878d23389508793a5f3c5dfa41c836bb88b9a01318fb3051232916e74a77cd9787eee5bd05a72e188c22b9ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sure \
python3.13dist-sure \
python313-sure \
python3dist-sure"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-six"

inherit rpm
