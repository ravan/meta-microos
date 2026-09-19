SUMMARY = "Python module for making CIM operation calls using the WBEM protocol"
DESCRIPTION = "PyWBEM is a Python module for making CIM operation calls using the WBEM \
protocol to query and update managed objects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.1"

RPM_NAME = "python313-pywbem-1.8.1-2.5.noarch.rpm"
RPM_HASH = "5e25ba15f705bdf67ed5ea7a87256a1c72184eaca0eff0dc308267b111a3dc336903af5b045e61464d5390b03942742d484326b9f047f4efde28e7931d93f47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywbem \
python3.13dist-pywbem \
python313-pywbem \
python3dist-pywbem"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-certifi \
python313-idna \
python313-ply \
python313-requests \
python313-urllib3 \
python313-yamlloader"

inherit rpm
