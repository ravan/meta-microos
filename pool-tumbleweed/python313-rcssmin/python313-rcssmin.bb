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

RPM_NAME = "python313-rcssmin-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "a2ab3faf1493c2faa42658c1d0ec7f2b326111555e9f19b00f5edb7201e8732b4a6b9a3c32429e2dde5bccab579c7365e087b1001328e0ebbb8bbfb192628e6e"

RPROVIDES:${PN} += "python3-rcssmin \
python3.13dist-rcssmin \
python313-rcssmin \
python3dist-rcssmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
