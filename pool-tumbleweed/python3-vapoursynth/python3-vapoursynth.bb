SUMMARY = "Python interface for VapourSynth"
DESCRIPTION = "Python interface for VapourSynth/VSScript."
LICENSE = "LGPL-2.1-only"

PV = "79"

RPM_NAME = "python3-vapoursynth-79-1.1.aarch64.rpm"
RPM_HASH = "6e014ee51e0f48e71bda410803ca1250093a086e1a273e4954fcec56997b558a5953da63cec14b3d6eb4a28899864a1af3510be357cc157331288c501c62b13d"

RPROVIDES:${PN} += "libvapoursynthfilters.so \
python3-vapoursynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvapoursynth.so.4 \
python-abi"

inherit rpm
