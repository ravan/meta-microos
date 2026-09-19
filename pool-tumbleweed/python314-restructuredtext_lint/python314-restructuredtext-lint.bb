SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python314-restructuredtext_lint-1.4.0-4.4.noarch.rpm"
RPM_HASH = "5d616b66add60cea3cdedffba81433634b2409c06bdbee2c963c21afd13955ef21157b52b2d5c2a4b8515c093f5e71fc7034dd4a0ec80219c80f14eecd669187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-restructuredtext-lint \
python314-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-docutils"

inherit rpm
