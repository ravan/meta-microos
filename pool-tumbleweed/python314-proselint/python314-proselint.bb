SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python314-proselint-0.14.0-1.8.noarch.rpm"
RPM_HASH = "61e7a0683ff1ae1902b5773da0ba61f0ad1ad8a072e932be969cea3bf8259ebb3db02229a73ee21159622ca26ed5bd642108f7618390321cb44e580bf315c78a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proselint \
python314-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-click \
python314-dbm \
update-alternatives"

inherit rpm
