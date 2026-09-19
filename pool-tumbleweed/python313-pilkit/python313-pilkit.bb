SUMMARY = "A collection of utilities and processors for the Python Imaging Libary"
DESCRIPTION = "PILKit is a collection of utilities for working with PIL (the Python Imaging \
Library). \
 \
One of its main features is a set of **processors** which expose a simple \
interface for performing manipulations on PIL images."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python313-pilkit-3.0-2.5.noarch.rpm"
RPM_HASH = "e3e66e984e8b06792216826a99c94e53ac917554b4534db2d30fcc0e8a5c1ac57df6adde0112ba2c135bb4df43213254bd09ada71a759071b00d9a7cc7a2367a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pilkit \
python3.13dist-pilkit \
python313-pilkit \
python3dist-pilkit"

RDEPENDS:${PN} += "python-abi \
python313-Pillow"

inherit rpm
