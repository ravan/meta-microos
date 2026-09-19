SUMMARY = "Snapper plugin for creating r/w /etc subvolumes"
DESCRIPTION = "This package contains the snapper plugin for creating /etc subvolumes on a \
read-only system."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "tukit-snapper-plugin-6.1.3-1.2.noarch.rpm"
RPM_HASH = "4504aac3a1692c5fe4561a3e2b024aad6cceb3f3e3fa9e2ba8578cfddd074d66e032ee7e160f13e4959646f7387cc80b407a2dc48600dc16682d0fb97800c875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tukit-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
tukit"

inherit rpm
