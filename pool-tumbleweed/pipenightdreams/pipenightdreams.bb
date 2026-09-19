SUMMARY = "Puzzle game similar to PipeMania"
DESCRIPTION = "PipeNightDreams is a PipeDream style game. The objetive of the game \
is to carry liquid from some point to the exit using different kinds \
of pipes. On each level there is a minimum number of required pipes \
that should be at least reached for it to be completed. \
 \
The score is increased by using as many pipes as possible an by \
collecting various bonus tokens making the liquid pass through their \
pipes. There are also life bonus and, hopefully soon, 'freeze tokens'."
LICENSE = "GPL-2.0+"

PV = "0.10.0"

RPM_NAME = "pipenightdreams-0.10.0-2.10.aarch64.rpm"
RPM_HASH = "050041f788707d383e3549efe62f43fe1ffd4b94db508e6f449f151df054026cdbdbc449ca0c5b80ecd7584f102ffefd64390b0f9ea482201ad7fd64faa13c01"

RPROVIDES:${PN} += "pipenightdreams"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
