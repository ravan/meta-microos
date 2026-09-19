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

RPM_NAME = "python314-passivetotal-2.5.9-2.12.noarch.rpm"
RPM_HASH = "d5f5d48c938d0177cc69ddad2916d425892c9ec507caf329354eb9439eef9cedc7d641a573dc88445ec7376dce052cf0d5843f394b7630838ee0b85f62152635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-passivetotal \
python314-passivetotal \
python3dist-passivetotal"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-python-dateutil \
python314-requests \
python314-tldextract \
update-alternatives"

inherit rpm
