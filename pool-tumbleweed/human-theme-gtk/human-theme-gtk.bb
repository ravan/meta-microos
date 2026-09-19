SUMMARY = "Human theme for GTK"
DESCRIPTION = "This theme is mainly intended for MATE and Xfce desktop environments. \
 \
After installation you must restart your session. \
After uninstallation be sure to remove the config file: \
 /etc/profile.d/human-theme-gtk.sh"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later & CC-BY-SA-3.0"

PV = "3.2.0"

RPM_NAME = "human-theme-gtk-3.2.0-1.1.noarch.rpm"
RPM_HASH = "2afa943864884420c46e495bd034700bf9db46e6d45e4ba7f4145431042db70143799d8c7c4060f883dede33fd17a795bb34e8795b6b4707d2bdd869f9a27199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-human-theme-gtk \
human-theme-gtk"

RDEPENDS:${PN} += ""

inherit rpm
