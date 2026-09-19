SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-ghp-import-2.1.0-5.5.noarch.rpm"
RPM_HASH = "0a18f3e4bfdebc6d2115a0cfad1b43d055688ee62eedaf37bdf2a6d38cb06b4899e8f44598c401d156302822ea039a7d57d96dfea82a6daf15304161735c5a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ghp-import \
python314-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-dateutil"

inherit rpm
