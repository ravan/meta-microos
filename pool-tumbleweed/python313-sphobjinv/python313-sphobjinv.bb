SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.3.1.2"

RPM_NAME = "python313-sphobjinv-2.3.1.2-3.5.noarch.rpm"
RPM_HASH = "2af6af83b567a1a9baad5e12acf5b7db14962f18da0313aaf8aadcea2c42b01900d1de44e62af548edebed1148f9ba2ef4f55ccedfaaf9cd313384be93578027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphobjinv \
python3.13dist-sphobjinv \
python313-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs \
python313-certifi \
python313-jsonschema"

inherit rpm
