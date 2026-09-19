SUMMARY = "Video4linux Configuration Tool"
DESCRIPTION = "This is a small utility used to configure video4linux device drivers \
(bttv, for example). xawtv, motv, and fbtv need it."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "v4l-conf-3.107-3.9.aarch64.rpm"
RPM_HASH = "e0dc840617bae5040d237d67ed103bbb6be23331a7a0785d83ab8af195aff6ecf3686c367f51c11e13a4953d0ccee049c76b3f32c293a65945f905c8cbc4f028"

RPROVIDES:${PN} += "v4l-conf \
xawtv-/usr/bin/v4l-conf"

RDEPENDS:${PN} += "/usr/bin/sh \
group-video \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
libc.so.6 \
permissions"

inherit rpm
