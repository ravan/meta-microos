SUMMARY = "LeechCraft Poshuku URL Keyword Support Module"
DESCRIPTION = "This package provides an LeechCraft Poshuku module for URL keywords."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-keywords-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0214fdd30934eca130cf542a1915ca5f103632e85bdd586d5449f01ce9ead6bf9d759ed76279372f50455ce75c501d5110322543ae6c5ec84596a80445660f25"

RPROVIDES:${PN} += "leechcraft-poshuku-keywords \
libleechcraft-poshuku-keywords.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
