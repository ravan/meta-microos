SUMMARY = "Retrieve and parse whois data for IPv4 and IPv6 addresses"
DESCRIPTION = "Retrieves and parses whois data for IPv4 and IPv6 addresses \
Parses a majority of whois fields in to a standard dictionary \
IPv4 and IPv6 support \
Supports RDAP queries (recommended method, see: https://tools.ietf.org/html/rfc7483) \
Proxy support for RDAP queries \
Supports legacy whois protocol queries \
Referral whois support for legacy whois protocol \
Recursive network parsing for IPs with parent/children networks listed \
National Internet Registry support for JPNIC and KRNIC \
Supports IP to ASN and ASN origin queries \
Python 2.7 and 3.4+ supported \
Useful set of utilities \
Experimental bulk query support \
Human readable field translations \
Full CLI for IPWhois with optional ANSI colored console output"
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-ipwhois-1.3.0-1.5.noarch.rpm"
RPM_HASH = "6ebcda39035d44408f8497462464a47ef386f83c9f97b004903dca1595c4835571a263759f88a385cee7dd1d37a4ccf2384c27c1c556cbb83caf9a07eaa591f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipwhois \
python314-ipwhois \
python3dist-ipwhois"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-defusedxml \
python314-dnspython"

inherit rpm
