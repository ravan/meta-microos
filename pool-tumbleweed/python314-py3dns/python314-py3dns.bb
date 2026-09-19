SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "4.0.2"

RPM_NAME = "python314-py3dns-4.0.2-1.9.noarch.rpm"
RPM_HASH = "bacd53cd6f8b8040e10ec0a311c071c6089648465c92d3fd091cf502599511808cddecdffcef43e6f6dfb13726bd6c81f47152216abc100b95a725c281900164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py3dns \
python314-py3dns \
python3dist-py3dns"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
