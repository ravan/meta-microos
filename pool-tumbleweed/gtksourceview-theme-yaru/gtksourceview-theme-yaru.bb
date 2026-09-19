SUMMARY = "Yaru GtkSourceView themes"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the GtkSourceView theme."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "gtksourceview-theme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "f171b088424e248c2c6d96d03553f7aee8fae2d94a23b82d8db002f0ebf0f4873fa1d0d64c6c4613c50346ff1912f0fec6c1999f9b3c3bf4482223795c9ba9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtksourceview-theme-yaru"

RDEPENDS:${PN} += ""

inherit rpm
