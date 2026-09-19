SUMMARY = "Upstream Branding of xfce4-settings"
DESCRIPTION = "This package provides the upstream look and feel for the Xfce Desktop Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "xfdesktop-branding-upstream-4.20.2-1.3.noarch.rpm"
RPM_HASH = "b1763d77f0d7650738a775c10f34e6fb2234a4ea0fb1a8f94f96f654d7c88f7bda872d2cee1b9b1fcc56d2579f8a820aecb87ae316b1e1f5c0514ece84cc825c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfce4-desktop-branding-upstream \
xfdesktop-branding \
xfdesktop-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
