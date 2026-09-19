SUMMARY = "Test update that requires a system reboot"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should inform the user that a system \
reboot is necessary. This is used, for example, in kernel updates."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-reboot-needed-5.2-1.15.aarch64.rpm"
RPM_HASH = "0563999e0b5a5b64bbeb7edf06a86c57201b857b5d9f0ef40f265b70727b1590937710e9e55bdff276833944d152bacc986e5094ab343b67620faa4443f022c9"

RPROVIDES:${PN} += "update-test-reboot-needed"

RDEPENDS:${PN} += ""

inherit rpm
