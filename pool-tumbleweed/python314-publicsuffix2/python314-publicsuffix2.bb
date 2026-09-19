SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
DESCRIPTION = "Get a public suffix for a domain name using the Public Suffix List. \
Forked from and using the same API as the publicsuffix package."
LICENSE = "MIT & MPL-2.0"

PV = "2.20191221"

RPM_NAME = "python314-publicsuffix2-2.20191221-3.5.noarch.rpm"
RPM_HASH = "dfa63e510a1cf6e3c098ad98490b2f6ee61dba3467faafe66bb2415f0ac626fab39b58f271e7901d68b6462e795b469b4d8a1b0762b142c28606031a07b3b296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-publicsuffix2 \
python314-publicsuffix2 \
python3dist-publicsuffix2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
