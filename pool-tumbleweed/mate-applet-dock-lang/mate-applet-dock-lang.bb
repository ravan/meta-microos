SUMMARY = "Translations for package mate-applet-dock"
DESCRIPTION = "Provides translations for the 'mate-applet-dock' package."
LICENSE = "GPL-2.0-or-later"

PV = "21.10.0"

RPM_NAME = "mate-applet-dock-lang-21.10.0-2.2.noarch.rpm"
RPM_HASH = "e785401082489b263df2fbcdf731a19a63f7fca5f700843bd72d1c7ad1f63e11747855f730c854fd98a8a6da233544c377452476b930fe38eeab9576f047e3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-applet-dock-es \
locale-mate-applet-dock-fr \
mate-applet-dock-lang \
mate-applet-dock-lang-all"

RDEPENDS:${PN} += "mate-applet-dock"

inherit rpm
