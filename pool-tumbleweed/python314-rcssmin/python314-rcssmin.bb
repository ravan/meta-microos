SUMMARY = "RCSSmin is a CSS Minifier Written in Python"
DESCRIPTION = "rCSSmin is a CSS minifier written in python. \
 \
The minifier is based on the semantics of the YUI compressor, which \
itself is based on the rule list by Isaac Schlueter. \
 \
This module is a re-implementation aiming for speed instead of maximum \
compression, so it can be used at runtime (rather than during a \
preprocessing step). rCSSmin does syntactical compression only \
(removing spaces, comments and possibly semicolons). It does not \
provide semantic compression (like removing empty blocks, collapsing \
redundant properties etc). It does, however, support various CSS hacks \
(by keeping them working as intended)."
LICENSE = "Apache-2.0"

PV = "1.2.2"

RPM_NAME = "python314-rcssmin-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "2e9f0e4a1ac9749a937463aa072545ed4516c7b7e2d2b74c2b165043891f3a3e202d04a619456336d3e2d71e9092ec959ad67e5ce5a1a3d276e114a54d923469"

RPROVIDES:${PN} += "python3.14dist-rcssmin \
python314-rcssmin \
python3dist-rcssmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
