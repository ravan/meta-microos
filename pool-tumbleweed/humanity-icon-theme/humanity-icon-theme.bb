SUMMARY = "Ayatana Humanity icon theme"
DESCRIPTION = "Humanity and Humanity Dark are nice and well polished icon themes for the Gtk \
desktop."
LICENSE = "GPL-2.0-only"

PV = "0.6.16"

RPM_NAME = "humanity-icon-theme-0.6.16-1.10.noarch.rpm"
RPM_HASH = "a7720234f0ea4b078c1e75313d43d484bffe6bb5807460eae3c2cc0dded085ceaa7bd0bbfa1b92ac704cd56efcf9e21e8b87582af9b0789ee10b537452383895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "humanity-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
hicolor-icon-theme"

inherit rpm
