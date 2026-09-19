SUMMARY = "Zope interface extension for defining data schemas"
DESCRIPTION = "Schemas extend the notion of interfaces to detailed descriptions of \
Attributes (but not methods).  Every schema is an interface and \
specifies the public fields of an object.  A *field* roughly \
corresponds to an attribute of a Python object.  But a Field provides \
space for at least a title and a description.  It can also constrain \
its value and provide a validation method.  Besides you can optionally \
specify characteristics such as its value being read-only or not \
required."
LICENSE = "ZPL-2.1"

PV = "8.1"

RPM_NAME = "python313-zope.schema-8.1-1.4.noarch.rpm"
RPM_HASH = "78dcf693dea11e35f0c64d980fa78a0431c1d5bc960f8eb5bcf81baa86d1d087ba413bfd4327fc04526ef11f63d508ee5d57e69463410134026d06065d7a8a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.schema \
python3.13dist-zope.schema \
python313-zope.schema \
python3dist-zope.schema"

RDEPENDS:${PN} += "python-abi \
python313-zope.event \
python313-zope.interface"

inherit rpm
