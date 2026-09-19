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

RPM_NAME = "python314-zope.schema-8.1-1.4.noarch.rpm"
RPM_HASH = "7c771ffd80eb1df262a7b2f2c5b394f6bc6c401b6ed03ba85872740c909b2aa7c4126153f2fac1e84576d98b915de19dcf2c52afe29ca9de8d92fb967419d957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.schema \
python314-zope.schema \
python3dist-zope.schema"

RDEPENDS:${PN} += "python-abi \
python314-zope.event \
python314-zope.interface"

inherit rpm
