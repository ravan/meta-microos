SUMMARY = "A DNS toolkit for Python"
DESCRIPTION = "dnspython is a DNS toolkit for Python. It supports almost all \
record types. It can be used for queries, zone transfers, and \
dynamic updates. It supports TSIG authenticated messages and EDNS0. \
 \
dnspython provides both high and low level access to DNS. The high \
level classes perform queries for data of a given name, type, and \
class, and return an answer set. The low level classes allow direct \
manipulation of DNS zones, messages, names, and records. \
 \
The package requires dependencies necessary for these optional features: \
- DNS over HTTPS (doh) \
- IDNA \
- DNSSEC \
and suggest dependencies necessary for these optional features: \
- trio \
This optional feature is not available due to missing dependencies: \
- wmi"
LICENSE = "ISC"

PV = "2.8.0"

RPM_NAME = "python313-dnspython-2.8.0-2.1.noarch.rpm"
RPM_HASH = "d92487cf5264e8bb7fc3ad536f3e6359b255a08c78578366005f2ff7056076ac8c877a71a02180735ae563d5b0517fa3bda0a4d428ad9121be6aa3bf6640b819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnspython \
python3.13dist-dnspython \
python313-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python313-cryptography \
python313-httpx \
python313-idna"

inherit rpm
