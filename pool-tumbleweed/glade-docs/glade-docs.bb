SUMMARY = "Documentation for GLADE User Interface Builder"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This package contains the documentation for Glade."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-docs-3.40.0-4.11.noarch.rpm"
RPM_HASH = "cfeeca164415e92b65073c44081a4b6fbe1ef92cee960391a79f736fbfc911da851d4ef01486e0a190f4d658880aa8a8e9f4153d9a5bd8c94c28e3b882bc4a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-docs"

RDEPENDS:${PN} += ""

inherit rpm
