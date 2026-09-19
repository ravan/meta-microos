SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "26.11.0"

RPM_NAME = "python314-python-gvm-26.11.0-1.3.noarch.rpm"
RPM_HASH = "1dd59df037f3a905debaaf8642d56bee7ed5605904ecf869cd28a76659028bb0916677362b73de737a710c75c3b535bd08969d696bf75dce86d84d7d5c03f2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-gvm \
python314-python-gvm \
python3dist-python-gvm"

RDEPENDS:${PN} += "python-abi \
python314-lxml \
python314-paramiko"

inherit rpm
