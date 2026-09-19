SUMMARY = "Plugin for nose or py.test that automatically reruns flaky tests"
DESCRIPTION = "Flaky is a plugin for py.test that automatically reruns flaky tests. \
 \
Ideally, tests reliably pass or fail, but sometimes test fixtures must rely on components that aren't 100% \
reliable. With flaky, instead of removing those tests or marking them to @skip, they can be automatically \
retried. \
 \
For more information about flaky, see `this presentation <http://opensource.box.com/flaky/>`_."
LICENSE = "Apache-2.0"

PV = "3.8.1"

RPM_NAME = "python313-flaky-3.8.1-1.9.noarch.rpm"
RPM_HASH = "b356be766eee5759b20862fb2e5a921dbe10536b9820ae476f8502acd155ba98dd501d0eb09b4daad316d34de2837e476d39aa09f896132c92585aaba2f66836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flaky \
python3.13dist-flaky \
python313-flaky \
python3dist-flaky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
