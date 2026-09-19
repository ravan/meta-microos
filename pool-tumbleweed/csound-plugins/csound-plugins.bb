SUMMARY = "Plugins for csound"
DESCRIPTION = "Plugins for csound"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-plugins-6.18.1-6.4.aarch64.rpm"
RPM_HASH = "39b918228085280e9bbbb7de7c4fe01b3660f029353f6bfb0773e8a7b17ca8be6f711a051bf60850478a8859a11fe9a78bd9471bceff17bb5b1580039d91de0b"

RPROVIDES:${PN} += "csound-plugins \
libampmidid.so \
libarrayops.so \
libbformdec2.so \
libcontrol.so \
libdeprecated.so \
libdoppler.so \
libdssi4cs.so \
libfractalnoise.so \
libftsamplebank.so \
libipmidi.so \
libjoystick.so \
liblfsr.so \
libmixer.so \
libosc.so \
libpadsynth.so \
libpvsops.so \
librtalsa.so \
librtjack.so \
librtpa.so \
librtpulse.so \
libsignalflowgraph.so \
libstdutil.so \
libtrigenvsegs.so \
liburandom.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
liblo.so.7 \
libm.so.6 \
libmvec.so.1 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
