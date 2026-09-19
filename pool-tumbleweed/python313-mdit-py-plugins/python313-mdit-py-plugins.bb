SUMMARY = "Collection of plugins for markdown-it-py"
DESCRIPTION = "Collection of core plugins for markdown-it-py."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python313-mdit-py-plugins-0.6.1-1.2.noarch.rpm"
RPM_HASH = "3d7e248b243270cd4055251f91ba18ee5de53dd9a6f65470567703731124930a97e7ec72d2a7558c9f796daa4e1e99908f2b5c202629eb34bb1422354fbd1076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mdit-py-plugins \
python3.13dist-mdit-py-plugins \
python313-mdit-py-plugins \
python3dist-mdit-py-plugins"

RDEPENDS:${PN} += "python-abi \
python313-markdown-it-py"

inherit rpm
