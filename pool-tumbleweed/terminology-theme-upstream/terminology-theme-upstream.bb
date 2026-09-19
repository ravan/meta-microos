SUMMARY = "Default Enlightenment theme"
DESCRIPTION = "For use with upstream branding, when using openSUSE themes, when using \
openSUSE themes. \
 \
Use the Dark theme instead."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-theme-upstream-1.13.0-1.13.aarch64.rpm"
RPM_HASH = "f556d76352ffdfe13e24e23b05685530602c33bf7be36382edfe0dcdf51303c290fa0b041caf335c950ac5c529843b216464192c1315cd6130c69e3492ea8d36"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-dft \
terminology-theme-upstream"

RDEPENDS:${PN} += ""

inherit rpm
