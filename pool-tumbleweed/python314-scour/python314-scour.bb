SUMMARY = "An SVG scrubber"
DESCRIPTION = "Scour is a Python script that aggressively cleans SVG files, removing \
a lot of 'cruft' that certain tools or authors embed into their \
documents. \
The goal of scour is to provide an identically rendered image."
LICENSE = "Apache-2.0"

PV = "0.38.2"

RPM_NAME = "python314-scour-0.38.2-3.5.noarch.rpm"
RPM_HASH = "ecd578278560ce650dfc551a3261a2c5d56e7b6d050e05b17ae2b5a10a3391d9d29f0abaf2e245629775633e6c94fbedfd885dcb2f7412f3dfae6a3e6515a880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-scour \
python314-scour \
python3dist-scour \
scour"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
