SUMMARY = "Python library and command-line utility for Shodan"
DESCRIPTION = "Shodan is a search engine for Internet-connected devices. Google lets you search for websites, Shodan lets you search for devices. This library provides developers easy access to all of the data stored in Shodan in order to automate tasks and integrate into existing tools."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "python313-shodan-1.31.0-4.5.noarch.rpm"
RPM_HASH = "c97ff2ae9de535349f5f4f6a05ca91be732fa62f506bbd83951382c7106ee889d3ea9dc5bf0ae30a07a05801cde4205d3e747dc75199eacdb42a7d36abcd3417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shodan \
python3.13dist-shodan \
python313-shodan \
python3dist-shodan"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-XlsxWriter \
python313-click \
python313-colorama \
python313-requests \
update-alternatives"

inherit rpm
