SUMMARY = "Zope hookable"
DESCRIPTION = "This package contains documentation files for python-zope.hookable."
LICENSE = "ZPL-2.1"

PV = "8.2"

RPM_NAME = "python-zope.hookable-doc-8.2-1.4.noarch.rpm"
RPM_HASH = "a3c5264d4253064a373534ce028e40fa1e6a6b51980692d1529acec1f139c099911a5b114d881f0cbb5b934af47f56ecbb89d5608dc01cf14a63f63b489de670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.hookable-doc \
python313-zope.hookable-doc \
python314-zope.hookable-doc"

RDEPENDS:${PN} += ""

inherit rpm
