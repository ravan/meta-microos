SUMMARY = "Automatic generated to pep8 checked code"
DESCRIPTION = "Autopep8 is automatic generated to pep8 checked code. \
This is old style tool, wrapped pep8 via subprocess module."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "python313-autopep8-2.3.2-2.5.noarch.rpm"
RPM_HASH = "feec608e43c1fc8e2969bc9dbae56be7a871e5e73189246b1161b3708cfd61359309aed11542184a7f26cfa5a7319d5c9636722ce828d931940be18211b88888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autopep8 \
python3.13dist-autopep8 \
python313-autopep8 \
python3dist-autopep8"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pycodestyle"

inherit rpm
