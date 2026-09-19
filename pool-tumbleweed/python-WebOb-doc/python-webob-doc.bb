SUMMARY = "WSGI request and response object - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebOb."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "python-WebOb-doc-1.8.10-1.3.noarch.rpm"
RPM_HASH = "56936f417a97a7ea0e748bd3187cf3692442d6b0b8e4d48d8f2e3c7b0cfb78a96e896427800877a1a9239a34eead566f6ed867afbba984af94007fbe5f4d93a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebOb-doc \
python313-WebOb-doc \
python314-WebOb-doc"

RDEPENDS:${PN} += ""

inherit rpm
