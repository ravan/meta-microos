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

RPM_NAME = "python313-lml-0.2.0-1.5.noarch.rpm"
RPM_HASH = "93b2975438d7e1b4d7a95449dd3409053540114b4aec6fe05af8d3ed33108501bdce86d87fc27a51c39a54143c2ab0321b90a9cd643d07c35d10f5646b3ec9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lml \
python3.13dist-lml \
python313-lml \
python3dist-lml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
