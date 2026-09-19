SUMMARY = "Zope 3 Deprecation Infrastructure"
DESCRIPTION = "This package contains documentation files for python-zope.deprecation."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python-zope.deprecation-doc-6.0-1.4.noarch.rpm"
RPM_HASH = "90df8d48ad5d2947fb43a8da417d6c5d3ad27a82bd606bc3b3fe57533883aa0e6efe38ff626cf50a649916492a50277445ccbce19087f690761ab209ebdd1572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.deprecation-doc \
python313-zope.deprecation-doc \
python314-zope.deprecation-doc"

RDEPENDS:${PN} += ""

inherit rpm
