SUMMARY = "Converts XML into JSON/Python dicts/arrays and vice-versa"
DESCRIPTION = "Converts XML into JSON/Python dicts/arrays and vice-versa"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-xmljson-0.2.1-1.2.noarch.rpm"
RPM_HASH = "9faaf459d13c37501815c4b24dede40e32b9241e4ea836740e95ef4e7e6008d92b9696e9e72b8ec371005afb42ce194169106518609245b0d7844733bedce2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xmljson \
python314-xmljson \
python3dist-xmljson"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
