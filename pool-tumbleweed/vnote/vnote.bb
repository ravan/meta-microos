SUMMARY = "A Vim-inspired note-taking application, especially for Markdown"
DESCRIPTION = "VNote is a note-taking application, designed especially for Markdown. \
VNote provides both note management and Markdown edit experience."
LICENSE = "LGPL-3.0-only"

PV = "3.20.1"

RPM_NAME = "vnote-3.20.1-1.1.aarch64.rpm"
RPM_HASH = "bfe233b4ab79b09e45cec6493cf34369450c8a3f1f48be08c9e41cc48a7c5958d3d4832e7cf3071eda787553298875bee5525e1e34c44c2823842e8693d20617"

RPROVIDES:${PN} += "bundled-vtextedit \
libVTextEdit.so \
vnote"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
