SUMMARY = "GTK+ 3 support for the Dracula theme"
DESCRIPTION = "This is a dark theme for GTK-3 and GTK-2 based desktop environments like \
Gnome, XFCE, Mate, Cinnamon, etc. Also provides support for KDE plasma. \
 \
This package provides the GTK+ 3 support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "gtk3-metatheme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "40cfbe94b0ff66477adb792c1202861f6beb893132e51dceaf4fa0796d0fa6f89f12b625b6c776442572a3ca6f30208a617e23471a6651225449eb607c78b8e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
gtk3-metatheme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common"

inherit rpm
