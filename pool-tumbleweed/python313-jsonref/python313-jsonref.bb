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

RPM_NAME = "python313-jsonref-1.1.0-1.12.noarch.rpm"
RPM_HASH = "efe6fe4f90debc4acf45bd2c71ee7c3bfccbde35418a00b82e5d2e46189604ce802013be7128a32d71de82e00469fc0f8132d4ddb2ded600f99c896c66cb48e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonref \
python3.13dist-jsonref \
python313-jsonref \
python3dist-jsonref"

RDEPENDS:${PN} += "python-abi"

inherit rpm
