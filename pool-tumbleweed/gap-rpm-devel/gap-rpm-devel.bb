SUMMARY = "RPM macros for building GAP packages"
DESCRIPTION = "GAP is a system for computational discrete algebra, with particular \
emphasis on Computational Group Theory. \
 \
This subpackage provides RPM macros for building GAP modules as RPMs."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.1"

RPM_NAME = "gap-rpm-devel-4.16.1-1.1.aarch64.rpm"
RPM_HASH = "54ef86566591dfe8b569f8eaa4a40f3915405b047363c84d7995d44b53e595ea968fbe2160dffe891079c1f8293a98516e4ba1a4d0f8a2b2a09bcba3ae10eb94"

RPROVIDES:${PN} += "gap-rpm-devel \
rpm-macro-gap-sitearch \
rpm-macro-gap-sitearch-anchor \
rpm-macro-gap-sitelib \
rpm-macro-gap-sitelib-anchor \
rpm-macro-gapdir \
rpm-macro-gappkg-simple-install"

RDEPENDS:${PN} += ""

inherit rpm
