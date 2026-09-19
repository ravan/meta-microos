SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "python314-pywbem-1.8.1-2.5.noarch.rpm"
RPM_HASH = "c347c6f3b43ae1e44fd536eb970e0909f0aa7790d3f1af3ebcb2b62402ecd90e5e2cfb492d9917990628572a8f4ca1fefea71f711b332d244506e3b2ac4ea80d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pywbem \
python314-pywbem \
python3dist-pywbem"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyYAML \
python314-certifi \
python314-idna \
python314-ply \
python314-requests \
python314-urllib3 \
python314-yamlloader"

inherit rpm
