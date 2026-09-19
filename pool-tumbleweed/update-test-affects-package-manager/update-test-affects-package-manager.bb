SUMMARY = "Test update that requires a software stack restart"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should be installed first by the \
update stack and then ask the user to run the update process \
again to apply other updates that might be available. This is \
used, for example, to update packages from the software update \
stack (zypper, libzypp, packagekit, etc)."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-affects-package-manager-5.2-1.15.aarch64.rpm"
RPM_HASH = "0cb9b372ca7bb577b0e1e6dbfd22df4eb7252701e5a108909bf28a53cd23635215f773a5d053957d59143a6f1068e0f912dd5a366415a7bdc751b92e34c97155"

RPROVIDES:${PN} += "update-test-affects-package-manager"

RDEPENDS:${PN} += ""

inherit rpm
