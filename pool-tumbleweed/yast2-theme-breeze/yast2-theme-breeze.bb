SUMMARY = "YaST2 - Breeze icon theme"
DESCRIPTION = "Contains icons in KDE Breeze style (from KDE Plasma 5)."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only & GPL-3.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-theme-breeze-5.0.2-1.2.noarch.rpm"
RPM_HASH = "c2aa05a04459357ee186e2339739ab7aa5bdd67f067018c474ece71b0fa471bea12c426cbc1892e556a5d242de0000ef5decea36e24b6a1d935e21532bd1f91a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-theme-breeze"

RDEPENDS:${PN} += "/usr/bin/bash \
breeze5-icons \
yast2-branding"

inherit rpm
