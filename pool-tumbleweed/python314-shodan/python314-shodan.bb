SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "python314-shodan-1.31.0-4.5.noarch.rpm"
RPM_HASH = "2ffbc54efb3277a9233114cf8eb6789cd3a3129e50600b68a90a8b1b81b5db35426f798f4b9204e60d5e5414469d1081569bfe3db18b053fbcbcd3f0c22d4498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shodan \
python314-shodan \
python3dist-shodan"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-XlsxWriter \
python314-click \
python314-colorama \
python314-requests \
update-alternatives"

inherit rpm
