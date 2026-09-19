SUMMARY = "GTK+ 4 support for the Dracula theme"
DESCRIPTION = "This is a dark theme for GTK-3 and GTK-2 based desktop environments like \
Gnome, XFCE, Mate, Cinnamon, etc. Also provides support for KDE plasma. \
 \
This package provides the GTK+ 4 support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "gtk4-metatheme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "6201f7054a75e36f96ce1fd83dba24995164ed633dc92c65cd0b975b16395d43d9597538fe42e67562847ebae78c29ad851396b187ea2fc2b797880194b8057d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
gtk4-metatheme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common"

inherit rpm
