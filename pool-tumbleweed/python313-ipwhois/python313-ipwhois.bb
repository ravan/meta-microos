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

RPM_NAME = "python313-ipwhois-1.3.0-1.5.noarch.rpm"
RPM_HASH = "e22303c8e6cf5d9fd3f6851ae8fe2d856f7603fa1c7f5d9da4eacd6777112f464952c32063e28738aabb5d13468ecdf40f4bdc0dbe60d51a62ee1ff30a422f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipwhois \
python3.13dist-ipwhois \
python313-ipwhois \
python3dist-ipwhois"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
python-abi \
python313-defusedxml \
python313-dnspython"

inherit rpm
