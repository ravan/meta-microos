SUMMARY = "Audio library with an OpenGL-resembling API"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
 \
OpenAL provides capabilities for playing audio in a virtual 3D \
environment. Distance attenuation, doppler shift, and directional \
sound emitters are among the features handled by the API. More \
advanced effects, including air absorption, occlusion, and \
environmental reverb, are available through the EFX extension. It \
also facilitates streaming audio, multi-channel buffers, and audio \
capture."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.3~179"

RPM_NAME = "libopenal1-1.24.3~179-1.6.aarch64.rpm"
RPM_HASH = "f44b2777367406705998dd2791a493e2bf923d0f349c0daba496cd362dc003ea484d58cd2916a7e915e9d638abbcfdb60c459a4da576b7008f3ffa75af431176"

RPROVIDES:${PN} += "libopenal.so.1 \
libopenal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libportaudio.so.2 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
