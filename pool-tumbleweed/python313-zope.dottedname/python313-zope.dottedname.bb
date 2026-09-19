SUMMARY = "Resolver for Python dotted names"
DESCRIPTION = "Resolver for Python dotted names."
LICENSE = "ZPL-2.1"

PV = "7.1"

RPM_NAME = "python313-zope.dottedname-7.1-1.3.noarch.rpm"
RPM_HASH = "03d0fe98ff8743e8110df8737bc1a782f1d46a395fc4814f9430cdc73976de6f3cba59b8df86e39ef88e596e36bc988d818dc1d9163d7353e7d4177b940db98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.dottedname \
python3.13dist-zope.dottedname \
python313-zope.dottedname \
python3dist-zope.dottedname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
