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

RPM_NAME = "python313-pytest-attrib-0.1.3-5.5.noarch.rpm"
RPM_HASH = "feb16e711e1a5626c6a840b4198f8ef39dd805d257ae9ac52609b3003d586f4ba361f214480f6a011450513c7c0b04a5845ce9f9bbb1c8c312940dec5a0c5718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-attrib \
python3.13dist-pytest-attrib \
python313-pytest-attrib \
python3dist-pytest-attrib"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
