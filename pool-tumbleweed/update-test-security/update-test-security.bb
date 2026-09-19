SUMMARY = "Test update that includes security fixes"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'security', indicating that one or more security vulnerabilities \
are being fixed."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-security-5.2-1.15.aarch64.rpm"
RPM_HASH = "6bd81bee02da5382e1e54f1be48eddc3ad88d228dc4522f71b854b637c2ff5967f41f8d4484929457df8e2e7b1833a12a95b72c59d54dd95db9c2097e2abfc89"

RPROVIDES:${PN} += "update-test-security"

RDEPENDS:${PN} += ""

inherit rpm
