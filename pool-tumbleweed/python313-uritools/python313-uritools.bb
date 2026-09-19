SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "6.1.1"

RPM_NAME = "python313-uritools-6.1.1-1.2.noarch.rpm"
RPM_HASH = "6ff0599c2d9f3cc56fa959307c0def4bed63ae4c86db7fd22a05f26f790cbd624e7e6c2d85058dd97e9d89aabdf2419bc07fbb605591c377b99e2fd99c1b40e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uritools \
python3.13dist-uritools \
python313-uritools \
python3dist-uritools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
