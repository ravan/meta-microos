SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "6.2.5"

RPM_NAME = "python314-rstcheck-6.2.5-1.6.noarch.rpm"
RPM_HASH = "2797f1017f80d46db070c8e8fb0b9a7baf39443332d90b720871d50c4562c65955184a041ae53e6dbed4938b70a0fbfc6f9dd7c663a45e793130b0cc7190f616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rstcheck \
python314-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-rstcheck-core \
python314-typer \
update-alternatives"

inherit rpm
