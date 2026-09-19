SUMMARY = "Program to generate and solve Sudoku puzzles in 2D or 3D"
DESCRIPTION = "KSudoku is a program that can generate and solve sudoku puzzles. The \
word Sudoku means 'single number in an alloted place' in Japanese. Some \
cells are filled with a number at the beginnning: the remaining are to \
be filled by the player using numbers from 1 to 9, without repeating a \
number twice on each column, row, or subsquare."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ksudoku-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b61383976694db2b0f9a432aefb96b54d671d213f80f42124cc870a880e7cb7fb287977e590c6801ad6f55972d91e810b23e855eeb0c7a6a1a297d1744d5e74a"

RPROVIDES:${PN} += "config-ksudoku \
ksudoku \
ksudoku5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libGLU.so.1 \
libKDEGames6.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libOpenGL.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
