SUMMARY = "Graphical code-plug programming tool for DMR radios"
DESCRIPTION = "qDMR is a simple to use and feature-rich code-plug programming software \
(CPS) for cheap DMR radios. \
 \
Currently supported devices are: \
 * Radioddity/Baofeng RD-5R \
 * TYT MD-UV390 \
 * Retevis RT3S \
 * Open GD77 firmware (GD77, RD-5R & DM-1801) \
 * AnyTone AT-D878UV, AT-D868UVE \
 * Radioddity GD77 (untested)"
LICENSE = "GPL-3.0-or-later"

PV = "0.15.1"

RPM_NAME = "qdmr-0.15.1-1.1.aarch64.rpm"
RPM_HASH = "05db3bf917b2b24ba9985fd2e9fde394d2aafc2a0dccb8930df189cf3525a222e7ca26d2a9806dba6097c248c1638ac40eb8ceb84d0d1930c66d109b4ea34cb7"

RPROVIDES:${PN} += "qdmr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdmrconf.so.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
