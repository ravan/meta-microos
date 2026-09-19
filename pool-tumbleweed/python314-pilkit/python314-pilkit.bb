SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python314-pilkit-3.0-2.5.noarch.rpm"
RPM_HASH = "c5d679712bc39aa48917fef40d1ad739a690ceea6977aa880b00bf87aa6edac8702d4a73704631ca88adab72a017bb2066488459bbcd87763dae1d89aced385a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pilkit \
python314-pilkit \
python3dist-pilkit"

RDEPENDS:${PN} += "python-abi \
python314-Pillow"

inherit rpm
