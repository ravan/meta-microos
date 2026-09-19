SUMMARY = "Test update that should be marked as retracted"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should mark the update as retracted \
in zypper."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-retracted-5.2-1.15.aarch64.rpm"
RPM_HASH = "e49b30d5f2cdfbea2df004d1c2e3e5cddf81ae6bc3bfaae8f1b8142a2c71626e52d39e99e792135f85c7c40ca7982853a7ba222e7464b5a481af7b572baf562a"

RPROVIDES:${PN} += "update-test-retracted"

RDEPENDS:${PN} += ""

inherit rpm
