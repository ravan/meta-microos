SUMMARY = "Pulseaudio plugin for xine"
DESCRIPTION = "libxine sound output plugin for the pulseaudio soundserver \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-pulse-1.2.13-11.5.aarch64.rpm"
RPM_HASH = "af398cdddf91b2e59da0a047acbcf9ed0474d29e6211526494bd056769113cf00a1e789e05361a5e77e7279eaaceb6bbd8394848db0e9c110920915571260deb"

RPROVIDES:${PN} += "libxine2-pulse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0 \
libxine.so.2 \
libxine2"

inherit rpm
