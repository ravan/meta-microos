SUMMARY = "Dracula Metacity themes"
DESCRIPTION = "This package contains the metacity themes."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "metacity-theme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "8047b25eb74b4a78217e72203462efadcfb32d0874e2022d720e6c88338a66b65724c0acc71df792b5f3f25b61cee030969a8e822a6e67459fdb0436c3bebd31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
metacity-theme-dracula"

RDEPENDS:${PN} += "metacity \
metatheme-dracula-common"

inherit rpm
