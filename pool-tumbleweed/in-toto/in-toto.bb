SUMMARY = "in-toto is a framework to protect supply chain integrity."
DESCRIPTION = "in-toto provides a framework to protect the integrity of the software supply chain. It does so by verifying that each task in the chain is carried out as planned, by authorized personnel only, and that the product is not tampered with in transit."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "in-toto-1.2.0-1.14.noarch.rpm"
RPM_HASH = "e893bf2057de37fb64dee713cb75f5cce7c9cca3e1654dd5eed3ad52efab48ba1f2bb95404ea10cff36f049b75adb7dec14104db32f1709e6863e82be120aa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "in-toto \
python3.13dist-in-toto \
python3dist-in-toto"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-attrs \
python3-iso8601 \
python3-pathspec \
python3-python-dateutil \
python3-securesystemslib"

inherit rpm
