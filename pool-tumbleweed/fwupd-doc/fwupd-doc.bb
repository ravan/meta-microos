SUMMARY = "Developer documentation for fwupd"
DESCRIPTION = "Developer documentation for fwupd."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-doc-2.1.7-2.1.noarch.rpm"
RPM_HASH = "c9ba967b3c6e3ea5d6178faadf561ebd1afc15692aeb259592024b3d6e57ef2c37d5de6b32b43a1b1e6289f9e28d1b6b067c839778c0550305a4242aab84f1dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-doc"

RDEPENDS:${PN} += ""

inherit rpm
