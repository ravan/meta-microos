SUMMARY = "openSUSE Branding of xfce4-power-manager"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Power Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfce4-power-manager-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "697d036cc92db20ab99411b34dfcb176092d22a2aa9b845ebf7cf0c0b13a8c7736885cc779808fd71cdd0477dabf73c473534500763bf2033ecfff238066212b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-power-manager-branding-openSUSE \
xfce4-power-manager-branding \
xfce4-power-manager-branding-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
