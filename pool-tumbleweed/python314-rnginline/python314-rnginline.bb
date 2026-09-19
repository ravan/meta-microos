SUMMARY = "Python libary to flatten multi-file RELAX NG schemas"
DESCRIPTION = "The rnginline package is a Python library and command-line tool for \
multi-file RELAX NG schemas from arbitary URLs, and flattening them \
into a single RELAX NG schema."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python314-rnginline-1.0.0-3.4.noarch.rpm"
RPM_HASH = "10850db7ff19590ce5216339157dd36e4772e0e507c09ca681c4aff86a4fb1ada2aad5995d4abcf5c9faa718fb2ed7943a5d51d3d99f9dc061b74a0732832ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rnginline \
python314-rnginline \
python3dist-rnginline"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-docopt \
python314-importlib-metadata \
python314-lxml \
python314-typing-extensions \
update-alternatives"

inherit rpm
