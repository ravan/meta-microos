SUMMARY = "A Gtk wrapper for Adwaita-for-Steam"
DESCRIPTION = "A GTK wrapper that installs and updates the Adwaita for Steam skin."
LICENSE = "GPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "AdwSteamGtk-0.8.0-1.5.noarch.rpm"
RPM_HASH = "23b406caa84b30939f0767dc148a074c6b5b042e096a903400faf8ade6f315d99f02ec902c28413e5d64b25a4efcda83ad1dd396c40dd15532cc7e2c58a0852b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AdwSteamGtk"

RDEPENDS:${PN} += "/usr/bin/python3 \
typelib-XdpGtk4"

inherit rpm
