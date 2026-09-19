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

RPM_NAME = "python314-django-test-migrations-1.5.0-1.5.noarch.rpm"
RPM_HASH = "540b2152dbfd1eae0b571afed50f90d35090cf87f8a094d5e3967383676042e767cc0ff921670754ffcd9dddf43bcdaaa34e5e02808b41f897bc5d3dda3bf5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-test-migrations \
python314-django-test-migrations \
python3dist-django-test-migrations"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
