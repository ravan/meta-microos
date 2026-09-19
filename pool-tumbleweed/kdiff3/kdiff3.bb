SUMMARY = "Code Comparison Utility"
DESCRIPTION = "KDiff3 is a program that: \
 \
* Compares or merges two or three text input files or directories \
* Shows the differences line-by-line and character-by-character \
* Provides an automatic merge facility and an integrated editor for \
  solving merge conflicts \
* Supports KDE's KIO framework (allows accessing ftp, sftp, fish, smb, etc.)"
LICENSE = "GPL-2.0-or-later"

PV = "1.12.5"

RPM_NAME = "kdiff3-1.12.5-1.1.aarch64.rpm"
RPM_HASH = "b8dff1f8c0c87a5b67279cdad42d44295f8c5d96b43d8e462f9545cdd43cca585f247ea0ebfef0033aeb1a3f344948b5091d5e188df7a6a1e8e31ac6c8f188c8"

RPROVIDES:${PN} += "kdiff3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
