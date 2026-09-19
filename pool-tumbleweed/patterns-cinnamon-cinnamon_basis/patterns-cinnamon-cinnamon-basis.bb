SUMMARY = "Cinnamon Base System"
DESCRIPTION = "Base packages for the cinnamon Desktop Environment"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "202021205"

RPM_NAME = "patterns-cinnamon-cinnamon_basis-202021205-2.16.aarch64.rpm"
RPM_HASH = "1ef4edeaf81359f3e06786c90ddacef2b912f828aca41a9976bb334e697d8362dce94f63545a52cc8e94ddfe6775b94173e51964b3a994b1d69f51a158069d3c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-cinnamon-cinnamon-basis \
patterns-openSUSE-cinnamon-basis"

RDEPENDS:${PN} += "cinnamon \
cinnamon-control-center \
cinnamon-screensaver \
cinnamon-session \
cinnamon-settings-daemon \
cjs \
pattern-"

inherit rpm
