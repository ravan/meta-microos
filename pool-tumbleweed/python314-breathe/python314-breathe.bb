SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.36.0"

RPM_NAME = "python314-breathe-4.36.0-3.5.noarch.rpm"
RPM_HASH = "cf139dcaee3b12000678e95a38a193a949554f7b5947a1ef6ed6af38b81413ac7e22880ecb6a010d6342e5aea155f2fa39d0b55c73281f9143d1335926b086eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-breathe \
python314-breathe \
python314-sphinxcontrib-breathe \
python3dist-breathe"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Sphinx"

inherit rpm
