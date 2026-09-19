SUMMARY = "Library to parse and apply unified diffs"
DESCRIPTION = "Patch-ng is a Python library to parse and apply unified diffs."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "python313-patch-ng-1.19.1-1.2.noarch.rpm"
RPM_HASH = "21bce552e2f03872662d3e2c0f93ffdccfa32296d8dfab5c850042a3ae94f4fd55ecf87140f7bd35ccb15bbfdf7b814cfa010c8b4a5d533bc7cc126a5d4f0903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patch-ng \
python3.13dist-patch-ng \
python313-patch-ng \
python3dist-patch-ng"

RDEPENDS:${PN} += "python-abi"

inherit rpm
