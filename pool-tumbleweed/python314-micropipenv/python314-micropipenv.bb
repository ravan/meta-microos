SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.10.0"

RPM_NAME = "python314-micropipenv-1.10.0-1.2.noarch.rpm"
RPM_HASH = "42725ca3d011fccd2b57aee88c0c7ed977b27321ec258d6db3fbb77aaafbabfb05603150aefdc2111e930838343ba08f5de49dfe72cb7576e5360885eeba6853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-micropipenv \
python314-micropipenv \
python3dist-micropipenv"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-pip"

inherit rpm
