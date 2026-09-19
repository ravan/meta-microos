SUMMARY = "Free Lemmings-like puzzle game"
DESCRIPTION = "Pingus is a free Lemmings-like puzzle game covered under the GNU GPL. \
It features currently 77 playable levels. \
 \
You can use to see which languages are supported \
 \
    pingus --list-languages \
 \
And start with \
 \
    pingus --language de \
 \
If you wish to play the other levels \
 \
    pingus /usr/share/pingus/levels/playable/some-level \
    pingus /usr/share/pingus/levels/incoming/some-level \
    pingus /usr/share/pingus/levels/wip/some-level \
 \
The other, probably more userfriendly, way is to simply load them into \
the level editor and then click the play button."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "pingus-0.7.6-20.5.aarch64.rpm"
RPM_HASH = "6e8d1ce6c6162480138d48bf60bace2f50431126ba44c9d95c4e854ce3797ddcc3213f4608c22efc818a174c70b76a012b31815d557df219d741a2b4b47311ae"

RPROVIDES:${PN} += "pingus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
