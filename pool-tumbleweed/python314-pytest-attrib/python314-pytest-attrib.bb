SUMMARY = "Pytest plugin to select tests based on attributes"
DESCRIPTION = "The pytest-attrib plugin extends py.test with the ability to select tests \
based on a criteria rather than just the filename or pytest.marks. For \
example, you might want to run only tests that need internet connectivity, \
or tests that are slow. \
 \
The pytest.mark  plugin already provides a featrure to mark tests and run \
only the marked tests. This plugin also allows to run expressions on the \
attributes of the class, and does not require the pytest.mark decorator. \
 \
It offers features similar to the nose plugin nose-attrib."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python314-pytest-attrib-0.1.3-5.5.noarch.rpm"
RPM_HASH = "682f73b2e2c2fc462e1b4b8a0644f73c3e298f429da5b38e962838a6d411364b473b4f214c83fedc672455a1aa54d8b93f6b364a12ebe2c80d352ffba66836e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-attrib \
python314-pytest-attrib \
python3dist-pytest-attrib"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
