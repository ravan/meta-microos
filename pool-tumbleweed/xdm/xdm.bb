SUMMARY = "X Display Manager"
DESCRIPTION = "Xdm manages a collection of X displays, which may be on the local host \
or remote servers."
LICENSE = "MIT"

PV = "1.1.17"

RPM_NAME = "xdm-1.1.17-5.3.aarch64.rpm"
RPM_HASH = "c34ee6178cbe74d0c14b7ea76dd9d425ad1caac138a204e110082f552b57dd2a5893aef045354b1b9c30a083a8051652e3a8bcacd4639311a7b14c7884dff7b3"

RPROVIDES:${PN} += "config-xdm \
libXdmGreet.so \
xdm"

RDEPENDS:${PN} += "/sbin/startproc \
/usr/bin/bash \
/usr/bin/pidof \
/usr/bin/sh \
cpp \
displaymanager-sysconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXaw.so.7 \
libXdmcp.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXmu.so.6 \
libXpm.so.4 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
logrotate \
sessreg \
systemd \
systemd-presets-common-SUSE \
update-alternatives \
xconsole \
xmessage \
xrdb \
xset \
xsetroot \
xterm-bin"

inherit rpm
