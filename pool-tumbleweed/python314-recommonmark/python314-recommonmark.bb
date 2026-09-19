SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python314-recommonmark-0.7.1-4.12.noarch.rpm"
RPM_HASH = "90826be1d8bf161aa94f3cda0ccf3871466f81a7e911059c3ab51375988e3d9630bb22ada713f0236c9f452e40bc14fda1af431dac887fed80a4ee68b80642b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-recommonmark \
python314-reCommonMark \
python314-recommonmark \
python3dist-recommonmark"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-CommonMark \
python314-Sphinx \
python314-docutils \
update-alternatives"

inherit rpm
