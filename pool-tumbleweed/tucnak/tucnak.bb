SUMMARY = "VHF and microwave contest log"
DESCRIPTION = "Tucnak is a amateur radio VHF and above contest logging program \
with some useful features as networking, cw keying, ssb voicer, \
sound recorder and more. User interface is based on Taclog."
LICENSE = "GPL-2.0-or-later"

PV = "4.73"

RPM_NAME = "tucnak-4.73-1.1.aarch64.rpm"
RPM_HASH = "e66ccfd868e3a78f8327500e5d884f96572fe5d857916ca725c77e92b192da795c909edf09fe865078fc079bab14b2c632201a9921553014102c11fccf303369"

RPROVIDES:${PN} += "tucnak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libftdi1.so.2 \
libglib-2.0.so.0 \
libgpm.so.2 \
libhamlib.so.4 \
libhidapi-hidraw.so.0 \
libm.so.6 \
libportaudio.so.2 \
librtlsdr.so.0 \
libsndfile.so.1 \
libzia-4.73.so"

inherit rpm
