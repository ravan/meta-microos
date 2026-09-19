SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python314-pythonwhois-2.4.3-6.10.noarch.rpm"
RPM_HASH = "a1555c3c9b304184e91dd9873a2265a1850161180c8be0351b8c45a1e1acf91f101563ae78ab4ebd2f2ea9072bfdec692f263df773dc4eb7d1e59f7e6ca86bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pythonwhois \
python314-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
