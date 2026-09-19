SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python313-publicsuffix2-2.20191221-3.5.noarch.rpm"
RPM_HASH = "09520874162886ab0f7749f1a923a76f412c9be3f365308ea0fbd4cf47271458d9e6afe719edbbb2f3e0fd944dc08ad834d2619235dd4939919fc4f5d9691417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-publicsuffix2 \
python3.13dist-publicsuffix2 \
python313-publicsuffix2 \
python3dist-publicsuffix2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
