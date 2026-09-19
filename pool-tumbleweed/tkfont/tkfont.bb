SUMMARY = "Tool to select fonts"
DESCRIPTION = "It is a program similar to xfontsel. \
 \
 \
 \
Authors: \
-------- \
    Neil Grant <grantj@sfu.ca>"
LICENSE = "GPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "tkfont-1.1-959.7.noarch.rpm"
RPM_HASH = "6240a05162696f6f52d7f1df12f5d52656dd2539235ce7cd1b713d270bd282adc410119acd57e88e6f10aea6ecb4ddd597af507027e62627fdaf59ebe6f3b199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tkfont"

RDEPENDS:${PN} += "/usr/bin/sh \
tk \
xlsfonts"

inherit rpm
