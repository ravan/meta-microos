SUMMARY = "Avocado Test Framework Example Tests"
DESCRIPTION = "The set of example tests present in the upstream tree of the Avocado framework. \
Some of them are used as functional tests of the framework, others serve as \
examples of how to write tests on your own."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "avocado-examples-113.0-1.2.noarch.rpm"
RPM_HASH = "689994635570c381a5cf6f14a3c3d90db9af42aced5df54feb1936ef4b203377781f878f73f853ee23eb5e16c51e41afd42ac9d3afe14fc985267d84d595362e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado-examples"

RDEPENDS:${PN} += "avocado"

inherit rpm
