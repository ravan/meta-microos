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

RPM_NAME = "python314-pytest-django-4.11.1-2.6.noarch.rpm"
RPM_HASH = "cf0ad6e4d83f25e5974e960adf69dceab019f245b88d1f35c969a424c79719155f850ccb6a11e5f0f6f9561116b27999cbff0f57b53d0677d0e703ba95f99b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-django \
python314-pytest-django \
python3dist-pytest-django"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-pytest"

inherit rpm
