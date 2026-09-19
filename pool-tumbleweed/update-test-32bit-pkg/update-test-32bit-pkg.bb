SUMMARY = "Test update that contains a 32bit package"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should contain a 32bit-package."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-32bit-pkg-5.2-1.15.aarch64.rpm"
RPM_HASH = "ee2e00c75ca44b5cf251f54ada90a845ceb936b45df7cf2845c65d6bf19e5b578dee4b19bb60855198db51575f73a03409f1119e21233adf9daea1df2f844776"

RPROVIDES:${PN} += "update-test-32bit-pkg"

RDEPENDS:${PN} += ""

inherit rpm
