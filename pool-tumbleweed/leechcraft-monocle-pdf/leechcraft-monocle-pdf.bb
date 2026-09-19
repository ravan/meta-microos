SUMMARY = "PDF support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PDF subplugin for LeechCraft Monocle. \
PDF support is provided via the libpoppler backend."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-pdf-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "6fc323219f393b9b9be9b0bc7b28962c3821929509f431ee2db20267abae1137506acf04174fbe8b216e34dbdcb15b566073d12b9285e4c4df90e27f48896f64"

RPROVIDES:${PN} += "leechcraft-monocle-pdf \
leechcraft-monocle-subplugin \
libleechcraft-monocle-pdf.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle-util-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm
