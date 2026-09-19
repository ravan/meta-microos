SUMMARY = "Upstream Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "xfce4-power-manager-branding-upstream-4.20.1-1.1.noarch.rpm"
RPM_HASH = "ca26206e60e941f0d6702a1910c60618bdec4af4e03ccdcd80af4cf03a2bff77223f87adfdfd73247d2e32127d9559e992441fa8ab167043ca72b3cca83c6818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-power-manager-branding-upstream \
xfce4-power-manager-branding \
xfce4-power-manager-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
