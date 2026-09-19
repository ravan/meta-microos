SUMMARY = "A lazy plugin management system for Python"
DESCRIPTION = "LML is 'Load me later'. lml seamlessly finds the lml-based \
plugins from the current Python environment but loads plugins on \
demand. It supports plugins that have external dependencies, \
especially bulky and/or memory hungry ones. lml provides the plugin \
management system only and the plugin interface is for the developer \
to do. \
 \
Plugins loaded by lml may be installed packages or standalone \
Python modules in a supplied directory."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python314-lml-0.2.0-1.5.noarch.rpm"
RPM_HASH = "9e083e2ae4ac50349dd191b0ff7eda9f3f72de41fb973abb022b79f394def3e341008ecc1da34ff1d831867aa4f6099ee216cb142a9b8bbf8f8f6a89a30c4f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-lml \
python314-lml \
python3dist-lml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
