SUMMARY = "A Django plugin for Pytest"
DESCRIPTION = "pytest-django allows testing Django projects/applications with the \
pytest testing tool. \
 \
Running the test suite with pytest-django allows tapping into the features \
that are already present in pytest: \
 \
* Manage test dependencies with pytest fixtures. \
* Less boilerplate tests: no need to import unittest and creating a \
  subclass with methods. Tests can be written as regular functions. \
* Database re-use: no need to re-create the test database for every test run. \
* Run tests in multiple processes for increased speed (with the pytest-xdist plugin). \
* Make use of other pytest plugins. \
* Works with both worlds: Existing unittest-style TestCase's still work without any modifications."
LICENSE = "BSD-3-Clause"

PV = "4.11.1"

RPM_NAME = "python313-pytest-django-4.11.1-2.6.noarch.rpm"
RPM_HASH = "2360634af4fa3a2e49f0edf5fa93233535e8c34e8ef1c99ad9008ccd2af226836c75ad4e5103368da68b2e2272f4b2b276d39745531f2fb82ab18466e10b9887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-django \
python3.13dist-pytest-django \
python313-pytest-django \
python3dist-pytest-django"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-pytest"

inherit rpm
