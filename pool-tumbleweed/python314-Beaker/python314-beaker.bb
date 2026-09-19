SUMMARY = "A Session and Caching library with WSGI Middleware"
DESCRIPTION = "Beaker is a web session and general caching library that includes WSGI \
middleware for use in web applications. \
 \
As a general caching library, Beaker can handle storing for various times \
any Python object that can be pickled with optional back-ends on a \
fine-grained basis. \
 \
Beaker was built largely on the code from MyghtyUtils, then refactored and \
extended with database support. \
 \
Beaker includes Cache and Session WSGI middleware to ease integration with \
WSGI capable frameworks, and is automatically used by Pylons. \
 \
Features include: \
 \
* Fast, robust performance \
* Multiple reader/single writer lock system to avoid duplicate simultaneous \
  cache creation \
* Cache back-ends include dbm, file, memory, memcached, and database (Using \
  SQLAlchemy for multiple-db vendor support) \
* Signed cookie's to prevent session hijacking/spoofing \
* Cookie-only sessions to remove the need for a db or file backend (ideal \
  for clustered systems) \
* Extensible Container object to support new back-ends \
* Cache's can be divided into namespaces (to represent templates, objects, \
  etc.) then keyed for different copies \
* Create functions for automatic call-backs to create new cache copies after \
  expiration \
* Fine-grained toggling of back-ends, keys, and expiration per Cache object"
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "python314-Beaker-1.13.0-2.5.noarch.rpm"
RPM_HASH = "06516271ee9a3f4d096eb1ebc5da4428b498920d5688ea377f53dae5781f9360f8654ce150fd518fa481eb2e6688a66326f051c74581f16f3f04d2410a58155c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-beaker \
python314-Beaker \
python3dist-beaker"

RDEPENDS:${PN} += "python-abi \
python314-dbm \
python314-pylibmc \
python314-setuptools"

inherit rpm
