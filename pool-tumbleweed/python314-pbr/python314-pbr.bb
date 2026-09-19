SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "7.0.3"

RPM_NAME = "python314-pbr-7.0.3-1.4.noarch.rpm"
RPM_HASH = "a453996f2e12ac070ef577e0e37db9e93d97fcf3e4d7897c747cfa1e8a8abf9a1ca05df85948e856feb98c9b8b603ee5376eddb7b75ad3b6bd43c201db273383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pbr \
python314-pbr \
python3dist-pbr"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
