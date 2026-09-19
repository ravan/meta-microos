SUMMARY = "SVG icon theme suitable for every desktop environment"
DESCRIPTION = "Kora is an SVG icon theme with lots of new icons for GNU/Linux operating systems. \
 \
To make them display properly, you may need to update the icon cache. A script is included. \
 \
Different versions available: \
 \
kora - theme with blue folder colors \
kora-pgrey - theme with grey folder colors (depends on Kora)"
LICENSE = "GPL-3.0-only"

PV = "2.0.6"

RPM_NAME = "kora-icon-theme-2.0.6-1.1.noarch.rpm"
RPM_HASH = "3745b75fe8cc8633cce22bca61560839f5c5a54f123869bac8bbf967595cfcd796712353ef5f492acde6d92bd506649119b037c6e347d77a9943b99d7cb0276c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kora-icon-theme"

RDEPENDS:${PN} += "gtk3-tools"

inherit rpm
