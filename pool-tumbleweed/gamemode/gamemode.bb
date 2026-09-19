SUMMARY = "Daemon/library combo for changing Linux system performance on demand"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
GameMode was designed primarily as a stop-gap solution to problems \
with the Intel and AMD CPU powersave or ondemand governors, but is \
now able to launch custom user defined plugins, and is intended to be \
expanded further, as there are a wealth of automation tasks one might \
want to apply. \
 \
For applications that don't implement the GameMode activation themselves, \
you can toggle the GameMode by running them via the gamemoderun command. \
 \
    gamemoderun ./game \
 \
For Steam games this can be done by editing the launch options: \
 \
    gamemoderun %command% \
 \
Note that some functionalities, like modifying the CPU governor, require \
the user to be in the priviledged 'gamemode' group."
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "gamemode-1.8.2-1.9.aarch64.rpm"
RPM_HASH = "a2bc01b3d596e5b6d071e38da927aa449cef2c5e965ea3f0891f5857657a420b5ad9d5746e3ea8683692f07d2c5e039968d39bc7f8b53660579de0c4127aa16b"

RPROVIDES:${PN} += "gamemode \
gamemoded-/usr/bin/gamemodelist \
gamemoded-/usr/bin/gamemoderun"

RDEPENDS:${PN} += "/usr/bin/bash \
libgamemodeauto0"

inherit rpm
