SUMMARY = "Devhelp plugin for Emacs"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for Emacs."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "emacs-plugin-devhelp-43.0-3.7.aarch64.rpm"
RPM_HASH = "ef8e9fde5e1d11a4cbec87f4933b7fff8e488b0186df7bde1b1b52210576ce8bdef257b1302c8dc0b29c3548441e18c5d5e648b1fd19d4c3b65331031fa3769e"

RPROVIDES:${PN} += "emacs-plugin-devhelp"

RDEPENDS:${PN} += "devhelp \
emacs"

inherit rpm
