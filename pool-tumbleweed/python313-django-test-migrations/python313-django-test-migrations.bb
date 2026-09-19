SUMMARY = "Test django schema and data migrations"
DESCRIPTION = "Features: \
* Allows to test django schema and data migrations \
* Allows to test both forward and rollback migrations \
* Allows to test the migrations order \
* Allows to test migration names \
* Allows to test database configuration \
* Fully typed with annotations and checked with mypy, PEP561 compatible \
* Easy to start: has lots of docs, tests, and tutorials"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-django-test-migrations-1.5.0-1.5.noarch.rpm"
RPM_HASH = "dce8b1f2560c8e33f5745a039055c5724e0e108b7383abf3003e094c3d684cff704f94b2b8b410498c24a734665936c4bd803294f634e03e7b3edcefb624d395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-test-migrations \
python3.13dist-django-test-migrations \
python313-django-test-migrations \
python3dist-django-test-migrations"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
