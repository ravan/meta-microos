SUMMARY = "Helper library to speed up start of applications on KDE workspaces"
DESCRIPTION = "Kdeinit is a process launcher somewhat similar to the famous init used for \
booting UNIX."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kinit-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "4a34e71cc8d55399927b295e2e4d9f213df5e303042e6c005e26642d56befc4d0bf914d5c5a81cba7b075186f8048242ea3890d4248c47707240ea954e183ff3"

RPROVIDES:${PN} += "kinit \
libkdeinit5-klauncher.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Service.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libX11.so.6 \
libc.so.6 \
libcap.so.2 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
