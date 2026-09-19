SUMMARY = "Image optimizer tool"
DESCRIPTION = "Optimize your images with OptiImage, a useful image compressor that supports \
PNG, JPEG, WebP and SVG file types. \
 \
It supports both lossless and lossy compression modes with an option whether to \
keep or not metadata of images. It additionally has a safe mode, where a new \
image is created instead of overwriting the old one. \
 \
It uses the following tools: \
 \
    oxipng for PNG images \
    jpegoptim for JPEG images \
    scour for SVG images \
    cwebp for WebP images"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "optiimage-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "b3412e75cf7d9db6d62106e490558df76642e2f7851afce4219e08662d47e1b2450e4337346594b911ed3943db8fed2739806e74269487a0c483a8ded72681cf"

RPROVIDES:${PN} += "optiimage"

RDEPENDS:${PN} += "/usr/bin/cwebp \
/usr/bin/jpegoptim \
/usr/bin/oxipng \
/usr/bin/scour \
kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libQCoro6Core.so.0 \
libQCoro6Qml.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
