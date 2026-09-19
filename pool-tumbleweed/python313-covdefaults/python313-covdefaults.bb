SUMMARY = "Python coverage plugin to provide default settings"
DESCRIPTION = "Python coverage plugin to provide default settings."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-covdefaults-2.3.0-3.5.noarch.rpm"
RPM_HASH = "b672fe9b64c476cef4b40d7b870fc4e6069ae195084f0ea3428281e5c0dbf877359177ef02c52596a2d825daf3f4593501d3ce9f91401a93a2e94551eb47a6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-covdefaults \
python3.13dist-covdefaults \
python313-covdefaults \
python3dist-covdefaults"

RDEPENDS:${PN} += "python-abi \
python313-coverage"

inherit rpm
