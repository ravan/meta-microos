SUMMARY = "Camsource Grabs Images from a Video4Linux Device"
DESCRIPTION = "Camsource grabs images from a video4linux device (webcam or TV card). \
It is modular and has several plug-ins for modifying the image before \
displaying it via HTTP or FTP upload."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "camsource-0.7.1-5.10.aarch64.rpm"
RPM_HASH = "5c52a0779ecfa61fba8758e7dad65ca8640e6342b35f51f22e6bc3172d6457af41adb4063a8729fb52bffe3a28211dc27ce7fbfce79bf5a0e4669ff2c55aa210"

RPROVIDES:${PN} += "camsource \
config-camsource \
libbw.so.0 \
libfilewrite.so.0 \
libflip.so.0 \
libftpup.so.0 \
libgamma.so.0 \
libhttp.so.0 \
libinput-v4l.so.0 \
libinput-xwd.so.0 \
libinvert.so.0 \
libjpeg-comp.so.0 \
libmotiondetect.so.0 \
libregrab.so.0 \
libresize.so.0 \
librgbbgr.so.0 \
librotate.so.0 \
libsaturate.so.0 \
libsharpen.so.0 \
libsocket.so.0 \
libtext.so.0 \
libvloopback.so.0 \
libwc-serv.so.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libv4l1.so.0 \
libxml2.so.16"

inherit rpm
