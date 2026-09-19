SUMMARY = "MATE Desktop GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Desktop Environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.28.2"

RPM_NAME = "mate-desktop-gschemas-1.28.2-1.13.aarch64.rpm"
RPM_HASH = "98153944dce76d02eeb72df1231309ca2a96d592179d9a14740bb95ce8ea0a92147a7e1730bfa7c8522a612841d5c9aafdf05c6ecbe1c7c7356463d1cfe4ac5a"

RPROVIDES:${PN} += "mate-desktop-gschemas \
mate-desktop-gsettings-schemas"

RDEPENDS:${PN} += "mate-desktop-gschemas-branding"

inherit rpm
