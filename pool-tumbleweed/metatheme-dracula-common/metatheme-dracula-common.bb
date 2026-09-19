SUMMARY = "Common files for the Dracula theme"
DESCRIPTION = "This is a dark theme for GTK-3 and GTK-2 based desktop environments like \
Gnome, XFCE, Mate, Cinnamon, etc. Also provides support for KDE plasma. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "metatheme-dracula-common-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "cd01d67df32b0f3ef4c5b66cda61e20939c4e0e628c9e4eda0696ee3f74464ccdf698011bfa2029984cc249dd866e3d4e7bb467290b739e9cdd927e9c196133c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
metatheme-dracula-common"

RDEPENDS:${PN} += ""

inherit rpm
