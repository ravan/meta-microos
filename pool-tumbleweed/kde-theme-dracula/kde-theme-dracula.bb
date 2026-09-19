SUMMARY = "KDE support for the Dracula theme"
DESCRIPTION = "This package provides the KDE support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "kde-theme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "1ac6c4faca4a403a3f498e1dd851b6f01774fd203fb833c119d4a3bc7d52b689e36657c9526d70825eee44be1162a5e94cc4952e002d4a3f37bf7b6c1daccc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
kde-theme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common \
plasma5-desktop"

inherit rpm
