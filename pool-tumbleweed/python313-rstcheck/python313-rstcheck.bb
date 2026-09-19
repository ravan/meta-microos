SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "6.2.5"

RPM_NAME = "python313-rstcheck-6.2.5-1.6.noarch.rpm"
RPM_HASH = "4ca6492488c28ae1992bbaa70d695f6eb7c973206d02e5361ced299cb33f724802bb883ed0f0cc80f178d97defe1e73e543cb809caf0bf3d24ff600197bc0621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rstcheck \
python3.13dist-rstcheck \
python313-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-rstcheck-core \
python313-typer \
update-alternatives"

inherit rpm
