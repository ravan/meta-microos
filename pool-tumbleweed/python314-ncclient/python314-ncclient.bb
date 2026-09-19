SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "python314-ncclient-0.7.1-1.4.noarch.rpm"
RPM_HASH = "85523cdbe7d4e287dbdd94750d7ded1a1a6ace117c26fbaa6273d6dd4f664610f27ea5aebca3770a040910fdac0962455baa12932330df44fa121a50ca25aae3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ncclient \
python314-ncclient \
python3dist-ncclient"

RDEPENDS:${PN} += "python-abi \
python314-lxml \
python314-paramiko"

inherit rpm
