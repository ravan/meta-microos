SUMMARY = "Audio player with graphical UI and library functionality"
DESCRIPTION = "Audacious is an audio player. It is based on Qt and supports a wide \
range of audio codecs. It still features an alternative skinned user \
interface (based on Winamp 2.x skins). Historically, it started as a \
fork of a fork of XMMS."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "audacious-4.6.1-1.3.aarch64.rpm"
RPM_HASH = "7634119812f2156de53349654540b3af03148b9851e5f8bc66f6a3159fad00413e5bff16a32292c38fa6d4b8f495e8d18d98da811576df8ccd980980f8811666"

RPROVIDES:${PN} += "audacious"

RDEPENDS:${PN} += "audacious-plugins \
ld-linux-aarch64.so.1 \
libaudcore.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
