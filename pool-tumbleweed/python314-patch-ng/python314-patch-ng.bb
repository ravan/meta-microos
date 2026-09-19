SUMMARY = "Library to parse and apply unified diffs"
DESCRIPTION = "Patch-ng is a Python library to parse and apply unified diffs."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "python314-patch-ng-1.19.1-1.2.noarch.rpm"
RPM_HASH = "8f551bd132981bbf8065d8cbc895dfd57e5495033e7074fd63ede380be88d8461ba4c8c1bbc1120f5ebcab191f19d632bd365f597600c66c5b92da3e6ae9b8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-patch-ng \
python314-patch-ng \
python3dist-patch-ng"

RDEPENDS:${PN} += "python-abi"

inherit rpm
