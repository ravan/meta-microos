SUMMARY = "Python module for DNS (Domain Name Service)"
DESCRIPTION = "This package contains a module (dnslib) that implements a DNS \
(Domain Name Server) client, plus additional modules that define some \
symbolic constants used by DNS (dnstype, dnsclass, dnsopcode)."
LICENSE = "CNRI-Python"

PV = "4.0.2"

RPM_NAME = "python313-py3dns-4.0.2-1.9.noarch.rpm"
RPM_HASH = "d8426c6fcbefe09671cf0977b7270cbeafec7c57994638dc97b19d3edfe5e7d16ac5307e6ce335548ced9487b4cd73663bb3b9eb94757271bc31efdab51afb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py3dns \
python3.13dist-py3dns \
python313-py3dns \
python3dist-py3dns"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
