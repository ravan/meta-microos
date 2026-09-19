SUMMARY = "Nimbus Icon Theme"
DESCRIPTION = "Nimbus is the name of a look-and-feel designed by Sun for the Java \
Desktop System."
LICENSE = "LGPL-2.0-or-later"

PV = "0.1.7"

RPM_NAME = "nimbus-icon-theme-0.1.7-15.4.noarch.rpm"
RPM_HASH = "27a01a5e1538d86196ac5eced7149f550d37f70bbb69e647167d74208d00aa960f64ca563cbfabc3c8c4df0b4d0b9cc396ceb632736f4663bad9cd835e47936a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nimbus-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
tango-icon-theme"

inherit rpm
