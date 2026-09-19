SUMMARY = "Lunar calendar Documents"
DESCRIPTION = "Documents for lunar-calendar"
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-calendar-doc-3.0.1-1.13.noarch.rpm"
RPM_HASH = "6fa2eae4f93f627a157bb8b1887fdf4d67a1a2a39c93ac6e61ba70fa182caba6db001948a49055715a37a21651d326118ad9179631da78f8a161d44dc3173d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lunar-calendar-doc"

RDEPENDS:${PN} += "lunar-calendar"

inherit rpm
