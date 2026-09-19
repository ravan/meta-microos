SUMMARY = "Apparmor profile for pantheon-mail"
DESCRIPTION = "This package ships only the apparmor profile for pantheon-mail"
LICENSE = "GPL-3.0-or-later"

PV = "8.0.0"

RPM_NAME = "pantheon-mail-apparmor-8.0.0-2.6.noarch.rpm"
RPM_HASH = "b2d0604c49f604a832a0e8247f3e4e29e8b549f7aeb9dca211ea20216340684a8cbfc0a1f2947b320b6b777451ef6f7e5040a38287a983608f0403fb7402df00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pantheon-mail-apparmor \
pantheon-mail-apparmor"

RDEPENDS:${PN} += ""

inherit rpm
