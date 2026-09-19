SUMMARY = "LADSPA Ambisonics plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins to implement Ambisonics effects.  Included are: mono and stereo \
input panner, horizontal rotation, and square and hexagon horizontal decoders."
LICENSE = "GPL-2.0+"

PV = "0.6.1"

RPM_NAME = "ladspa-AMB-0.6.1-4.36.aarch64.rpm"
RPM_HASH = "f89f3f261c9d891f13ba60662a90bd8704bcfec79e6febdb7e6dcaff058002950614181b4fef39e90d3876b6ff914550c82ca336b0a183383f4544364b88b8df"

RPROVIDES:${PN} += "ladspa-AMB"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
