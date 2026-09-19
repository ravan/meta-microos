SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-ghp-import-2.1.0-5.5.noarch.rpm"
RPM_HASH = "f0aa9894f5e332493571892d910bba4505d5a3fef4c739c750b554d3784519a7fc799de5dd57e69ae42acfffe5f03b1c401358e66219528b26c2e90d31872c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ghp-import \
python3.13dist-ghp-import \
python313-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-dateutil"

inherit rpm
