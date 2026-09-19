SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python313-PyMsgBox-1.0.9-2.5.noarch.rpm"
RPM_HASH = "3f339409f2c7888f6a692b12d28ca642f709026ebe2442b1bbf9bd289810e0da7fe4eefc3ee871d65d1428f51cbca5c74fefee15289cd1e63e80f88f4d7b1307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMsgBox \
python3.13dist-pymsgbox \
python313-PyMsgBox \
python3dist-pymsgbox"

RDEPENDS:${PN} += "python-abi"

inherit rpm
