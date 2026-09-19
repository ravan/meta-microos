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

RPM_NAME = "python314-entrypoints-0.4-3.1.noarch.rpm"
RPM_HASH = "734721403d895e80d3a5541612540cc76a6965600acc3fadd9dc354aaa50a1c8660e1be199bfe42b9c805d31360a75151a9d293433ddba06b3e38d10067bf969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-entrypoints \
python314-entrypoints \
python3dist-entrypoints"

RDEPENDS:${PN} += "python-abi"

inherit rpm
