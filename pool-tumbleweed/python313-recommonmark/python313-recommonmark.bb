SUMMARY = "Python docutils-compatibility bridge to CommonMark"
DESCRIPTION = "A python docutils-compatibility bridge to CommonMark. \
 \
This allows you to write CommonMark inside of Docutils & Sphinx projects. \
 \
Documentation is available on Read the Docs: \
http://recommonmark.readthedocs.org"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python313-recommonmark-0.7.1-4.12.noarch.rpm"
RPM_HASH = "c1d57c177c4407d5a9e7af775894fae18bbb418f0095bea5f939538085671642670abfe827698502a5816b0743cd4e865cb27800616fb3f5806a6609a114aa83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reCommonMark \
python3-recommonmark \
python3.13dist-recommonmark \
python313-reCommonMark \
python313-recommonmark \
python3dist-recommonmark"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-CommonMark \
python313-Sphinx \
python313-docutils \
update-alternatives"

inherit rpm
