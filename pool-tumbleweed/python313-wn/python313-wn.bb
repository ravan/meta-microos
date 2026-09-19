SUMMARY = "Wordnet interface library"
DESCRIPTION = "Wn is a Python library for exploring information in wordnets."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-wn-0.13.0-1.4.noarch.rpm"
RPM_HASH = "9552e7924a53e3ffcc0e2447ae020d3af6dda661c0e1304bb265dd7b7357f61691dd8bbf7c95e8fa1418da694546f549f88387e0dda8dd049156f0f9f710baa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wn \
python3.13dist-wn \
python313-wn \
python3dist-wn"

RDEPENDS:${PN} += "python-abi \
python313-httpx \
python313-tomli"

inherit rpm
