SUMMARY = "Snorenotify is a multi platform Qt based notification framework"
DESCRIPTION = "Snorenotify is a multi platform Qt based notification framework. Using a plugin system it is possible to create notifications with many different notification systems on Windows, Unix and Mac."
LICENSE = "LGPL-3.0-only"

PV = "0.7.0"

RPM_NAME = "snorenotify-qt5-devel-0.7.0-4.4.aarch64.rpm"
RPM_HASH = "75b7c2eb9129b18816ed08ad1fcdf391c6310088cca49e55777d0a7a568d91b3e0cbf4280116999d872815b7a0d5206134701ab5f60c9df38c06ff54a925eb87"

RPROVIDES:${PN} += "cmake-LibsnoreQt5 \
cmake-LibsnoreSettingsQt5 \
snorenotify-qt5-devel"

RDEPENDS:${PN} += "snorenotify-qt5"

inherit rpm
