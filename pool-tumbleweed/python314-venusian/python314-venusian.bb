SUMMARY = "A library for deferring decorator actions"
DESCRIPTION = "Venusian is a library which allows framework authors to defer \
decorator actions.  Instead of taking actions when a function (or \
class) decorator is executed at import time, you can defer the action \
usually taken by the decorator until a separate 'scan' phase. \
 \
See the 'docs' directory of the package or the online documentation at \
http://docs.pylonsproject.org/projects/venusian/dev/."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.1.1"

RPM_NAME = "python314-venusian-3.1.1-1.7.noarch.rpm"
RPM_HASH = "aa5b87a3746fa90c3fc03b23d7a509e464b1e4d7f06fdcd223b4163110ef18bf0a64574e28dbc09f467c169228540623e0a99c3d5660cdbe19116520beb24faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-venusian \
python314-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
