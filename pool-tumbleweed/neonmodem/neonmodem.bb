SUMMARY = "BBS-style command line client for Discourse, Lemmy, Lobsters and Hacker News"
DESCRIPTION = "Neon Modem Overdrive is a BBS-style command line client that supports Discourse, Lemmy, Lobsters and Hacker News as backends, and seamlessly integrates all of them into a streamlined TUI."
LICENSE = "GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "neonmodem-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "1c28dce019984688617da1da8f836e0ed5d01a3e6c94aa0e8e6e23a9a8ee5a8d15b592c245948c3ea8e5d465f0e0f3e16e3b18c931982ff889fc61c1531dd308"

RPROVIDES:${PN} += "neonmodem"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
