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

RPM_NAME = "python313-venusian-3.1.1-1.7.noarch.rpm"
RPM_HASH = "f045a8a8f069b8ba4c133be6121f446647257131b11e9fd65e3dff4092b532dd54040e68a72773c33c234548b84920871ca000c3b5659abd304da5107b94f818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian \
python3.13dist-venusian \
python313-venusian \
python3dist-venusian"

RDEPENDS:${PN} += "python-abi"

inherit rpm
