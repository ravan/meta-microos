SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python313-pbr-7.0.3-1.4.noarch.rpm"
RPM_HASH = "a46343aaaa85e4990c2ca9fc70881ec9566e8c43e4f9ccd4501e4cc80dcc9493d7cca7457e54f4fa3a210961be2f83f0b53e8297d6c5f8e1476f3f5d06d55859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbr \
python3.13dist-pbr \
python313-pbr \
python3dist-pbr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
