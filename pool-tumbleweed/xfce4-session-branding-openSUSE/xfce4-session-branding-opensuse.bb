SUMMARY = "openSUSE Branding of xfce4-session"
DESCRIPTION = "This package provides the openSUSE look and feel for the Xfce Session Manager."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfce4-session-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "199d36c92c451327a042c15a45b53f3a46098605b262b57565133629501074bb858772efc0cd345e90b6f992b27d4bcd53dc74cf0753d4a5c47096e1ab1acac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-session-branding-openSUSE \
xfce4-session-branding \
xfce4-session-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-xfce-icon-theme \
desktop-file-utils \
gtk3-metatheme-greybird-geeko \
libgio-2-0-0 \
metatheme-greybird-geeko-common \
thunar-volman"

inherit rpm
