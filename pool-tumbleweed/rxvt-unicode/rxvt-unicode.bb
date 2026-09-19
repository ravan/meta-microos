SUMMARY = "Rxvt X Terminal with Unicode Support"
DESCRIPTION = "rxvt-unicode is a clone of the well-known terminal emulator rxvt, \
modified to store text in Unicode (either UCS-2 or UCS-4) and to use \
locale-correct input and output. It also supports mixing multiple fonts \
at the same time, including Xft fonts."
LICENSE = "GPL-3.0-or-later"

PV = "9.31"

RPM_NAME = "rxvt-unicode-9.31-3.18.aarch64.rpm"
RPM_HASH = "3039233a3c73f041e16548c423431b0c312e384378a3061a02616668503298449c6ee28eb0712fc4cc05519d5785f482f2ca235328707370bf3f60b10c227de4"

RPROVIDES:${PN} += "locale-xorg-x11-ja;ko;zh \
perl-urxvt \
perl-urxvt--anyevent \
perl-urxvt--popup \
perl-urxvt--term \
perl-urxvt--term--extension \
perl-urxvt--watcher \
rxvt-unicode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libperl.so \
libptytty.so.0 \
libstartup-notification-1.so.0 \
perl \
terminfo-base"

inherit rpm
