SUMMARY = "User tools for libqtxg"
DESCRIPTION = "User tools for libqtxdg. \
qtxdg-tools contains a CLI MIME tool, qtxdg-mat, for handling file \
associations and opening files with their default applications. \
It is maintained by the LXQt project and needed by LXQt Session, in order \
to be used by xdg-utils. Yet it can be used independently from LXQt, too."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0"

RPM_NAME = "qtxdg-tools-4.4.0-1.3.aarch64.rpm"
RPM_HASH = "69a36bf85da6d15a219d15839e79506d1749ca4bda577108fc175a34695b315baa090d77b1feceba796340436df40a60c4aed6d0f484723e63694c0dd477db7f"

RPROVIDES:${PN} += "cmake-qtxdg-tools \
qtxdg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Xdg.so.4 \
libc.so.6 \
libstdc++.so.6 \
xdg-utils"

inherit rpm
