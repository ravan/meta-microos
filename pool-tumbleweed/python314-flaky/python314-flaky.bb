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

RPM_NAME = "python314-flaky-3.8.1-1.9.noarch.rpm"
RPM_HASH = "01f04b70a3b836889b18ec0ac83cc42659d07f97f9851c44bc322c7008e9e6e7a7942e1cb2646f04c1b178055ad8b0e2a56017852bf80979557c01a229d856a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flaky \
python314-flaky \
python3dist-flaky"

RDEPENDS:${PN} += "python-abi"

inherit rpm
