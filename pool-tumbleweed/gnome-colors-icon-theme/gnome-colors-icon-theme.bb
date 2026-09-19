SUMMARY = "A complete, multi-colored suite of icons for Linux"
DESCRIPTION = "The GNOME-Colors is a project that aims to make the GNOME desktop as \
elegant, consistent and colorful as possible. \
 \
The current goal is to allow full color customization of themes, icons, \
GDM logins and splash screens. There are already five full \
color-schemes available; Brave (Blue), Human (Orange), Wine (Red), \
Noble (Purple) and Wise (Green). \
 \
GNOME-Colors is mostly inspired/based on Tango, GNOME, Elementary, \
Tango-Generator and many other open-source projects."
LICENSE = "GPL-2.0+"

PV = "5.5.1"

RPM_NAME = "gnome-colors-icon-theme-5.5.1-18.24.noarch.rpm"
RPM_HASH = "17210d6b49c7b54fa3024899b6970277674b07b3d47e70b36b6caf572c8bcc3f45dac1da7fccab06aae4cc54c9960955840977814d438c22fab5f97aa064c9ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-colors-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm
