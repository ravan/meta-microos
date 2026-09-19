SUMMARY = "Plugin for click to show the command tree of your CLI"
DESCRIPTION = "click-command-tree is a click plugin to show the command tree of your CLI"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-click-command-tree-1.2.0-1.9.noarch.rpm"
RPM_HASH = "8e71fff2d08cb1749d4a787214c9fd79da5ee3e501dc9b17780bd311337f2299bd65faa0578e418496d601bc9331a0aab290f75bb0901bbc5b2a2b63dca8191c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-command-tree \
python3.13dist-click-command-tree \
python313-click-command-tree \
python3dist-click-command-tree"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
