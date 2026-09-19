SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.116.0"

RPM_NAME = "syntax-highlighting-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "e25948c608ab99b1bc5022cb7b9b7c05cadcff6d3ca0ecfef6cf8f25075630c5cf7a8aed1459c822793403d4b572bae9e5623c4276eb2f0c928c16b0e4fd55e1"

RPROVIDES:${PN} += "cmake-KF5SyntaxHighlighting \
syntax-highlighting-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5Gui \
libKF5SyntaxHighlighting5"

inherit rpm
