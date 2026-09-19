SUMMARY = "Digital modem program (hamradio)"
DESCRIPTION = "Digital modem program. \
Supports the following modes: \
CW, Contestia, DominoEX, Hell, MFSK, MT63, Olivia, Psk, RTTY, Thor, Throb \
WEFAX, WWV calibration, Frequency Analysis, Tune"
LICENSE = "GPL-3.0-only"

PV = "4.2.13"

RPM_NAME = "fldigi-4.2.13-1.1.aarch64.rpm"
RPM_HASH = "c83e611a1ad015002502954dca2fecdb78c4bb232981f67672da749d21e6b86b47ac1549e63bc4abc4b23a26e135fbe26845e847b21086e022c18299790dc88a"

RPROVIDES:${PN} += "fldigi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libflxmlrpc.so.1 \
libgcc-s.so.1 \
libhamlib.so.4 \
libm.so.6 \
libpng16.so.16 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
