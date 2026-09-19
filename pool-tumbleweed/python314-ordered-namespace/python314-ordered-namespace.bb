SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python314-ordered-namespace-2019.6.8-2.5.noarch.rpm"
RPM_HASH = "2af2622cabcf37a9a8f3c7d889d0c22ed8aefa4c1c820bd21aaa966b3819c99345b1c7c9e3b462d688312ad73ed7547976281c54266bd13e04e1e1bdca42ad7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ordered-namespace \
python314-ordered-namespace \
python3dist-ordered-namespace"

RDEPENDS:${PN} += "python-abi"

inherit rpm
