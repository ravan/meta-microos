SUMMARY = "Pytest Plugin for Twisted"
DESCRIPTION = "pytest-twisted is a plugin for pytest, which allows to test code, \
which uses the twisted framework. test functions can return Deferred \
objects and pytest will wait for their completion with this plugin."
LICENSE = "BSD-2-Clause"

PV = "1.14.3"

RPM_NAME = "python313-pytest-twisted-1.14.3-1.9.noarch.rpm"
RPM_HASH = "ca4ec2437ff936998c6b28eb88152f51c1f8b3bd327ec2841daf118e96576b64372476a02171a537a3cca6587e15ac6bb6c3d29144993994038ddb68f8e189de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-twisted \
python3.13dist-pytest-twisted \
python313-pytest-twisted \
python3dist-pytest-twisted"

RDEPENDS:${PN} += "python-abi \
python313-Twisted \
python313-decorator \
python313-greenlet \
python313-pytest"

inherit rpm
