SUMMARY = "Classical memory game"
DESCRIPTION = "LPairs is a classical memory game. This means you have to find pairs of \
identical cards which will then be removed. Your time and tries needed \
will be counted but there is no highscore chart or limit to this."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "lpairs-1.0.5-1.22.aarch64.rpm"
RPM_HASH = "5efb5669fd99228a9f39227eb16d9012108af1ae38600a4721e8e3b026e149136bfb67ca2d54bb0525be1066098a6c442ebbd64c79c8658c74b8859bd767b971"

RPROVIDES:${PN} += "lpairs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
