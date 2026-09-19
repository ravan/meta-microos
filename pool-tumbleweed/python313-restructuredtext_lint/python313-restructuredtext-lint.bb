SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python313-restructuredtext_lint-1.4.0-4.4.noarch.rpm"
RPM_HASH = "bebf13a63e969c936592654cb9b5f7ddef4eb342b5931a524ac323e0712c4ec9bfe164cda914cb7d528a15f955341f3df4f07d91de4f6f395835dcbaebda6aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-restructuredtext-lint \
python3.13dist-restructuredtext-lint \
python313-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-docutils"

inherit rpm
