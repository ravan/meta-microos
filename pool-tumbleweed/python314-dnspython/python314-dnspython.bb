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

RPM_NAME = "python314-dnspython-2.8.0-2.1.noarch.rpm"
RPM_HASH = "42e2b91ecca5d1d822515f3df59c87493e6e3b9a37ae7178464cb892038af4666c52d5031977a6e2b43886b0cee462569027f560604d415a97d6d724601ab222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dnspython \
python314-dnspython \
python3dist-dnspython"

RDEPENDS:${PN} += "python-abi \
python314-cryptography \
python314-httpx \
python314-idna"

inherit rpm
