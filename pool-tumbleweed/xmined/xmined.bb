SUMMARY = "Graphical interface using Xterm of Mined text editor"
DESCRIPTION = "Mined is a powerful text editor with a comprehensive yet concise and \
easy-to-use user interface supporting modern interaction paradigms, \
and fast, small-footprint behaviour. \
 \
Mined provides both extensive Unicode and CJK support offering many \
specific features and covering special cases that other editors \
are not aware of (like auto-detection features and automatic handling \
of terminal variations, or Han character information). \
It was the first editor that supported Unicode in a plain-text terminal \
(like xterm or rxvt)."
LICENSE = "GPL-3.0-or-later"

PV = "2022.27"

RPM_NAME = "xmined-2022.27-4.8.aarch64.rpm"
RPM_HASH = "a67e25a13ad6d222cb70dc23dd26da1e1cf22c937523076df5b9b842f04858617d7430cd6943d6582b94c855df011440827b0977f64151c308afcea5e81660af"

RPROVIDES:${PN} += "xmined"

RDEPENDS:${PN} += "/usr/bin/sh \
mined \
xterm-bin"

inherit rpm
