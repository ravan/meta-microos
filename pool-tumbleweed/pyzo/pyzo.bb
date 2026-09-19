SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "pyzo-4.11.2-2.5.noarch.rpm"
RPM_HASH = "d1525c90ca57c3ddccc0ff8ad583d518a758cc6a0cb289c00c9927ed442ba7ed77f0f5471e4e71d5f3ca5764fc75f2cf1cfc48eb6d1f0241cf69cb519303c88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyzo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-pyzo"

inherit rpm
