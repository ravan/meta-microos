SUMMARY = "Development files for GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-shell-devel-50.4-1.1.aarch64.rpm"
RPM_HASH = "5ae762f30ab22858b1590cc97964ae0d231d0d4c7065ae5c42c0101ec9d5c89f70d10c6809b03e997fe145e1fb4c902e2e83f155527fc9c746c6745c219b2bd3"

RPROVIDES:${PN} += "gnome-shell-devel"

RDEPENDS:${PN} += "gnome-shell"

inherit rpm
