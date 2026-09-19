SUMMARY = "Liberate the universe from the evil company WEAPCO"
DESCRIPTION = "Project: Starfighter is an old school 2D shoot 'em up. In the game you take on \
the role of a rebel pilot called Chris, who is attempting to overthrow a \
military corporation called Weapco. Weapco has seized control of the known \
universe and currently rules it with an iron fist. Chris can no longer stand \
back and watch as millions of people suffer and die. He steals an experimental \
craft known as 'Firefly' and begins his mission to fight his way to Sol, \
freeing key systems along the way. The game opens with Chris attempting to \
escape a Weapco patrol that has intercepted him."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "starfighter-2.4-2.9.aarch64.rpm"
RPM_HASH = "930a2ae7f39a565786144e9b9966177d90cd1fd6ad4e10e01cf064c1609b219aaddf2364eea390ed3174856796fd5df823c2275c37215b829f127abbe55a7db2"

RPROVIDES:${PN} += "starfighter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
