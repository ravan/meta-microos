SUMMARY = "Discover and load entry points from installed packages"
DESCRIPTION = "Entry points are a way for Python packages to advertise objects with \
some common interface. The most common examples are console_scripts \
entry points, which define shell commands by identifying a Python \
function to run. \
 \
Groups of entry points, such as console_scripts, point to objects with \
similar interfaces. An application might use a group to find its \
plugins, or multiple groups if it has different kinds of plugins."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python313-entrypoints-0.4-3.1.noarch.rpm"
RPM_HASH = "8ff13fae912ba1f1db99ccfb021d0c780e68f50d3b2e5cc25c8c01e50d2943028035b8c4515bfdacaa618afc6f16fc96738e95033ef6a62f2d5e6c4966efc371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-entrypoints \
python3.13dist-entrypoints \
python313-entrypoints \
python3dist-entrypoints"

RDEPENDS:${PN} += "python-abi"

inherit rpm
