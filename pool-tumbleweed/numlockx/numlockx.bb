SUMMARY = "Switch on/off or toggle numlock"
DESCRIPTION = "This little thingy allows you to start X with NumLock turned on ( which \
is a feature that a lot of people seem to miss and nobody really knew \
how to achieve this ). This code relies on X extensions called XTest \
and XKB, so you need to have at least one of these X extensions \
installed ( you most probably do ). \
 \
 \
 \
Authors: \
-------- \
    Lubos Lunak <l.lunak@kde.org> \
    XKB stuff by Oswald Buddenhagen <ossi@kde.org>"
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "numlockx-1.2-182.1.aarch64.rpm"
RPM_HASH = "cf4b8016a58ee2b7ada578f3d0000a1a70c4fdabebd70c93e24749a2d75eafd5d254d6fa8c98a3576f61f52885499eb7d9f5f715e79a57b10b8dee996c9be8c8"

RPROVIDES:${PN} += "numlockx \
numlockx-default \
x11-tools-/usr/X11R6/bin/numlock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
