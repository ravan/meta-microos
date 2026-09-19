SUMMARY = "Collection of day-to-day tools (binaries)"
DESCRIPTION = "A collection of various tools. Some of the important ones: \
 \
* checkbrack(1) — check parenthesis and bracket count \
* fd0ssh(1) — pipe for password-over-stdin support to ssh \
* ofl(1) — open file lister (replaces fuser and lsof -m) \
* tailhex(1) — hex dumper with tail-following support"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "hxtools-20251011-1.6.aarch64.rpm"
RPM_HASH = "83122bcb463d413c1d3b2546935e46c90d8b7a0400e17bc106752489aed5035612f1a8a4cadc59eaf7899eae3aedfd5be5d436ea6d62abc4f2a9833db16d5a0b"

RPROVIDES:${PN} += "hxtools"

RDEPENDS:${PN} += "/usr/bin/sh \
fd0ssh \
hxtools-scripts \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ofl \
sysinfo"

inherit rpm
