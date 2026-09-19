SUMMARY = "Convert various requirements-type files to use with pip-tools"
DESCRIPTION = "A simple wrapper around pip to support requirements.txt, Pipenv and Poetry files for containerized applications"
LICENSE = "LGPL-3.0-or-later"

PV = "1.10.0"

RPM_NAME = "python313-micropipenv-1.10.0-1.2.noarch.rpm"
RPM_HASH = "3e739acd17046974d1d4ae0f63495fa65297d9fee0a87bb05ed0b1821fd16d6ed28359a3883eec59da7ffb9d3656cdf018ab70e8a0ec7f2f45d84ecefbf2d0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-micropipenv \
python3.13dist-micropipenv \
python313-micropipenv \
python3dist-micropipenv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pip"

inherit rpm
