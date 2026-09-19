SUMMARY = "openSUSE Branding of libgarcon"
DESCRIPTION = "This package provides the openSUSE look and feel for Garcon."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "libgarcon-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "6f2184f0a9ab60a8979c244705992e93442c07ed0046b63d2f38133e1bae7f37bcca46a95aeeba7a4842aef10b6fcbea55ff56b68945c4b71a37f817c3fd8971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libgarcon-branding-openSUSE \
libgarcon-branding \
libgarcon-branding-openSUSE"

RDEPENDS:${PN} += "desktop-data-openSUSE \
libxfce4ui-tools \
wallpaper-branding \
xfce4-settings-branding-openSUSE"

inherit rpm
