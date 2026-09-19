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

RPM_NAME = "python313-Beaker-1.13.0-2.5.noarch.rpm"
RPM_HASH = "595a13a2b1fb9a29d2d014db332ae90a623a6cd4fd7688eda5f8bbc2060c48a1b56f9c589cb4ef759ba1aabce1201ef42a598b79df4c98c48ef7d112a76fd2b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Beaker \
python3.13dist-beaker \
python313-Beaker \
python3dist-beaker"

RDEPENDS:${PN} += "python-abi \
python313-dbm \
python313-pylibmc \
python313-setuptools"

inherit rpm
