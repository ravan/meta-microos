SUMMARY = "Compiled end-to-end test suite for CDI"
DESCRIPTION = "The upstream CDI functional (ginkgo) test suite compiled to a single \
binary, for running the e2e tests against a deployed CDI. Test fixture \
images are not included; a test runner supplies them."
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-tests-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "c9015377650f263a19f30c44ead9b87fe56fafa761859c10f85ed8df6e44a9b60fa1d9501d62c6a824c6964df2fadc0890ff1f80d4ee1d496af5112497ea8375"

RPROVIDES:${PN} += "containerized-data-importer-tests \
containerized-data-importer1.66-tests"

RDEPENDS:${PN} += ""

inherit rpm
