SUMMARY = "Zope Location"
DESCRIPTION = "This package contains documentation files for python-zope.i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "8.2"

RPM_NAME = "python-zope.i18nmessageid-doc-8.2-1.4.noarch.rpm"
RPM_HASH = "7da4ac6173bdc07ce25a868c2df60cb9381f7a93d07f16196d7534ec19667375d83797c2d6ec2abdfd05fe9784bf8a2ac974edde1cf0cf961bc1a3dc0012c213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.i18nmessageid-doc \
python313-zope.i18nmessageid-doc \
python314-zope.i18nmessageid-doc"

RDEPENDS:${PN} += ""

inherit rpm
