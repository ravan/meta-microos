SUMMARY = "Test update that requires confirmation"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should show a message to the user \
and wait for confirmation before proceeding. This is used, for \
example, in package updates that include proprietary licenses."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-interactive-5.2-1.15.aarch64.rpm"
RPM_HASH = "b265a2bf7b4b9f4827d0c987e0c784777b6a08072b9d952b2f451c842d9e6711555aac4d4ed7512838f95ecbc6d03293866bcb8e4440c51ab3728d29886e4aee"

RPROVIDES:${PN} += "update-test-interactive"

RDEPENDS:${PN} += ""

inherit rpm
