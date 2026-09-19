SUMMARY = "A linter for prose"
DESCRIPTION = "proselint is a linter for English prose. (A linter is a computer \
program that, like a spell checker, scans through a document and \
analyzes it.) \
 \
Proselint is a command-line utility that can be integrated into \
existing tools."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python313-proselint-0.14.0-1.8.noarch.rpm"
RPM_HASH = "da7f09a8cc078d98afcd0834f7ea15857b47eee0c1a9f1ec554ab2c2f86ffc1ed78031225091901043428e7538682d725af8e69f1996523c8bda08304dab2049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proselint \
python3.13dist-proselint \
python313-proselint \
python3dist-proselint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-click \
python313-dbm \
update-alternatives"

inherit rpm
