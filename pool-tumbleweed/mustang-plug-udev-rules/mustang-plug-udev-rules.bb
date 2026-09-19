SUMMARY = "Udev rules to grant access to Mustang amps"
DESCRIPTION = "Graphical interface to control amplifier and effect stages \
of Fender Mustang guitar amplifiers. \
 \
This sub-package contains udev rules granting access to the \
hardware for regular (non-root) users."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "mustang-plug-udev-rules-1.4.3-2.12.noarch.rpm"
RPM_HASH = "ac730a378a9ad88e95d2b00573ddbba171b5ed127e1aeae24986b9c611fa98db4673e0bc7bfa195c91062a837055d41f797d0000d7e81ebc958ecc82a9a6c350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mustang-plug-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
