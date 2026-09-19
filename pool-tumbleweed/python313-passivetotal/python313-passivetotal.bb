SUMMARY = "Client for the PassiveTotal REST API"
DESCRIPTION = "Passivetotal provides a Python client library implementation into RiskIQ API \
services. The library currently provides support for the following services: \
 \
- Passive DNS queries and filters \
- WHOIS queries (search and details) \
- SSL Certificates (search and details) \
- Account configuration \
- Site actions (tagging, classifying, etc.)"
LICENSE = "GPL-2.0-only"

PV = "2.5.9"

RPM_NAME = "python313-passivetotal-2.5.9-2.12.noarch.rpm"
RPM_HASH = "a625715d6708bbd548a170775ba04e1e19cb63d2ed4c83bcc8e1094787655211df2ab2d1769954902226aa4fc2011f8057f05c6a85b37baf2df3aca4edd9638e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passivetotal \
python3.13dist-passivetotal \
python313-passivetotal \
python3dist-passivetotal"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-python-dateutil \
python313-requests \
python313-tldextract \
update-alternatives"

inherit rpm
