SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.3"

RPM_NAME = "python314-pytest-twisted-1.14.3-1.9.noarch.rpm"
RPM_HASH = "0db9bd62b18ad35798821ba8d666505cf340591aa31726562612a790591a305b31599ea91ecfaf647b3e35380dcfa9139c1ce6c9df6d4a6e5c5da633ff51407b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-twisted \
python314-pytest-twisted \
python3dist-pytest-twisted"

RDEPENDS:${PN} += "python-abi \
python314-Twisted \
python314-decorator \
python314-greenlet \
python314-pytest"

inherit rpm
