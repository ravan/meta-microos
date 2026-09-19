SUMMARY = "Open source spaceship bridge simulator"
DESCRIPTION = "EmptyEpsilon places you in the roles of a spaceship's bridge officers, like those seen in Star Trek. While you can play EmptyEpsilon alone or with friends, the best experience involves 6 players working together on each ship. \
Each officer fills a unique role: Captain, Helms, Weapons, Relay, Science, and Engineering. Except for the Captain, each officer operates part of the ship through a specialized screen. The Captain relies on their trusty crew to report information and follow orders."
LICENSE = "GPL-2.0-only"

PV = "2024.12.08"

RPM_NAME = "emptyepsilon-2024.12.08-5.1.aarch64.rpm"
RPM_HASH = "2993ff9a8a8d16cd5e393633a0720db38f35526b8f69451306baa010e2a23e2c4f6f7700f997b4067a73172cd9563d357441a325035af2f3f0a7c54bc332e86e"

RPROVIDES:${PN} += "emptyepsilon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
