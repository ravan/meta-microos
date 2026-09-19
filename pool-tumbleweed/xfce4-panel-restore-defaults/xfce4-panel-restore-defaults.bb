SUMMARY = "Script to restore Xfce Panel Defaults"
DESCRIPTION = "This package provides a script /usr/bin/xfce4-panel-restore-defaults which calls allows to restore the Xfce Panel factory defaults. \
A desktop file and application launcher is provided."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.8"

RPM_NAME = "xfce4-panel-restore-defaults-4.20.8-1.1.aarch64.rpm"
RPM_HASH = "4fb48fef399740cbffb2caa3004350107582b95044e435c036837237211f408ae9c3a151eb126f567292fcdc0baa06cfe8f81ad8b7dc6103671d018a801f6245"

RPROVIDES:${PN} += "xfce4-panel-restore-defaults"

RDEPENDS:${PN} += "/usr/bin/bash \
zenity"

inherit rpm
