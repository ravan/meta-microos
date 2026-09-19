SUMMARY = "Minimal dumb-terminal emulation program"
DESCRIPTION = "picocom is a dumb-terminal emulation program, similar to 'minicom', \
for the purpose of manual modem configuration, testing, and \
debugging. It can be used as a low-tech 'terminal window' to allow \
operator intervention in PPP connection scripts (something like the \
'open terminal window before / after dialing' feature in MS Windows)."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "2024.07"

RPM_NAME = "picocom-2024.07-1.8.aarch64.rpm"
RPM_HASH = "2c96dd74d82ec68a0e89b5b2200296b690d22d1982ec7fedf88c9f7290aaab0e1191b024ee4de74d72857e8f79e3cab63fa2e4944a14c5b02d365f7c8457e409"

RPROVIDES:${PN} += "bundled-linenoise \
picocom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
