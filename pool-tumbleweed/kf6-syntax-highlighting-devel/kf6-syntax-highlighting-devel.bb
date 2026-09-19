SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "6.30.0"

RPM_NAME = "kf6-syntax-highlighting-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e33f1adf32c7014e3b225bda0db90043f7457d5745e4cc2ecb65527debf564363620ac37aae8877c0d76d579526274627d741df8b2f64f77220175dc9f7aaaa0"

RPROVIDES:${PN} += "cmake-KF6SyntaxHighlighting \
kf6-syntax-highlighting-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Gui \
kf6-extra-cmake-modules \
libKF6SyntaxHighlighting6"

inherit rpm
