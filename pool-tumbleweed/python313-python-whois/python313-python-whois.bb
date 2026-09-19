SUMMARY = "Whois querying and parsing of domain registration information"
DESCRIPTION = "A simple importable Python module which will produce parsed WHOIS data for a given domain. \
Able to extract data for all the popular TLDs (com, org, net, ...) \
Query a WHOIS server directly instead of going through an intermediate web service like many others do."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "python313-python-whois-0.9.6-2.1.noarch.rpm"
RPM_HASH = "b47e3b9640da3f5dd8daccbfeea912c2dbca0e20195dfa91734f27a4642081d67cc0a938d7ab8d16fc3894b4903e78f8fcacf7d128bb9073e6e6ce19cf2cabad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-whois \
python3.13dist-python-whois \
python313-python-whois \
python3dist-python-whois"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
