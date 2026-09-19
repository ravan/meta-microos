SUMMARY = "A script to generate Sphinx ReST from Doxygen XML"
DESCRIPTION = "Sphinxygen is a Python module/script that generates Sphinx markup to describe a C API, from an XML description extracted by Doxygen."
LICENSE = "ISC"

PV = "1.0.12"

RPM_NAME = "python314-sphinxygen-1.0.12-1.1.noarch.rpm"
RPM_HASH = "04d72d430a933e4ccbd2f1543771251dbc7d162d07f1b1b534064e8dd9b4fa78d9e6f8dbf2d26bac7876a414ab28822923b76fd55362849a0008d95e4e42890c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxygen \
python314-sphinxygen \
python3dist-sphinxygen"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
