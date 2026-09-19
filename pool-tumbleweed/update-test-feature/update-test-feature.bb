SUMMARY = "Test update that includes new features"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'feature', indicating that it includes a new feature and not \
only fixes."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-feature-5.2-1.15.aarch64.rpm"
RPM_HASH = "dce2a78bd15e6b5af567b0ec16abe4b6780b250ec0c7f2e8adb147b5a8638ae794ca2d1a5b99bb99f160ae1cae4ab68a1a8805bc36f8c8fd81a8ffe20e003ea3"

RPROVIDES:${PN} += "update-test-feature"

RDEPENDS:${PN} += ""

inherit rpm
