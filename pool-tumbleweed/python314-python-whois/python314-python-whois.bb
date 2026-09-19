SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "python314-python-whois-0.9.6-2.1.noarch.rpm"
RPM_HASH = "b41e81b12c3c0fd88f3395cd39ba8c4c6d6079ef990d200291eb8841b50ca6c36358d896938259bab757577706d145b0560cf9d9791c3bb3e60c47bf15a9621e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-whois \
python314-python-whois \
python3dist-python-whois"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
