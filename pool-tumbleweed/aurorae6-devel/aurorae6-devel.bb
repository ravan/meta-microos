SUMMARY = "Themeable window decoration for KWin"
DESCRIPTION = "Aurorae is a themeable window decoration for KWin. \
 \
It supports theme files consisting of several SVG files for decoration and \
buttons. Themes can be installed and selected directly in the configuration \
module of KWin decorations."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "aurorae6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "a96c1f90b508b3badea1cf75cf6f49973d83bc5c16cd4939fa5dbb9b424235690f0c4b261520b615919887319c0eea4ac557962c765615b53fb8ac94c0f3cb0c"

RPROVIDES:${PN} += "aurorae6-devel \
cmake-Aurorae"

RDEPENDS:${PN} += "aurorae6"

inherit rpm
