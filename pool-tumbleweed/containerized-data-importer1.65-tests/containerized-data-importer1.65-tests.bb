SUMMARY = "Compiled end-to-end test suite for CDI"
DESCRIPTION = "The upstream CDI functional (ginkgo) test suite compiled to a single \
binary, for running the e2e tests against a deployed CDI. Test fixture \
images are not included; a test runner supplies them."
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-tests-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "3f2a407c4e28739813c7f9fba2221940496a65b34d6d60687c7495722772f37b3cf01d741caf2dbcc07e9690aa99adc0bb3bab5a1325a51981f63eb967c3e2ac"

RPROVIDES:${PN} += "containerized-data-importer-1.65-tests \
containerized-data-importer-tests \
containerized-data-importer1.65-tests"

RDEPENDS:${PN} += ""

inherit rpm
