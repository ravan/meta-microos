SUMMARY = "GUI control tool for RME Digi32 and RME Digi96 soundcards"
DESCRIPTION = "Rmedigicontrol is a control tool for RME Digi32 and RME Digi96 soundcards. \
It depends on ALSA and GTK+ and offers a graphical frontend for all your \
switches."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.5a"

RPM_NAME = "rmedigicontrol-0.3.5a-29.4.aarch64.rpm"
RPM_HASH = "04aad8176b125fe2d1733b631417f45880f84020a6a77e8de3fc261db3c0613e6c658cb60ae55e68cef16b3fc6bc63d92350531498cc1629bbbf588380af14fc"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/rmedigicontrol \
rmedigicontrol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgtk-x11-2.0.so.0"

inherit rpm
