SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python314-gobject-devel-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "2fc0e1940c70c897dfe17b3b6c9580e3eda3111c0bf2e745576ff3359a2e87b369e6a1f059c5eed8a4fde084b1524dbe24605802143e3d55b0ec66254a358625"

RPROVIDES:${PN} += "python314-gobject-devel"

RDEPENDS:${PN} += "python314-devel \
python314-gobject \
python314-gobject-Gdk \
python314-gobject-cairo \
python314-gobject-common-devel"

inherit rpm
