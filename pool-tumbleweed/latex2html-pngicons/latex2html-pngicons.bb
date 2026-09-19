SUMMARY = "Icons in the PNG format for LateX2HTML"
DESCRIPTION = "Icons in the PNG format for the LaTeX to HTML Converter."
LICENSE = "GPL-2.0-or-later"

PV = "2026"

RPM_NAME = "latex2html-pngicons-2026-1.3.noarch.rpm"
RPM_HASH = "1cc5c3b3d189dd3a43ccb8899a8c18651a4622e3904c6e1ee8eee0ff8acfe8178fbd90fbc2298782b13c02d2858711766db8ebf087eeae8dae52e36981071783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-pngicons"

RDEPENDS:${PN} += ""

inherit rpm
