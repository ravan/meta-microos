SUMMARY = "An implementation of JSON Reference for Python"
DESCRIPTION = "jsonref is a library for automatic dereferencing of JSON Reference \
objects for Python (supporting 2.6+ including Python 3). \
 \
This library lets you use a data structure with JSON reference objects, as if \
the references had been replaced with the referent data. \
 \
Features \
* References are evaluated lazily. Nothing is dereferenced until it is used. \
* Recursive references are supported, and create recursive python data \
  structures. \
References objects are actually replaced by lazy lookup proxy objects which are \
almost completely transparent. \
Complete docs can be found at http://jsonref.readthedocs.org/"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-jsonref-1.1.0-1.12.noarch.rpm"
RPM_HASH = "e1f4f4e297910c1c3e9c0b379237273c708c9c1ca73219e96b4546195d45dd81b3fb27335503d653144103050756d3b2e6c4972fe70962e67475ac3170c97229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonref \
python314-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
