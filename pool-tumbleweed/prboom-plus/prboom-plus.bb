SUMMARY = "DOOM source port with demo compatibility"
DESCRIPTION = "PrBoom+ is a conservative Doom source port. It features: \
 \
* The removal of engine limits and bugs, like the visplane limit, \
  savegame size limit, the tutti-frutti and medusa visual effects, \
  and others. \
* BOOM editing extensions, e.g. configurable animated/switch \
  textures, deep water effect, scrolling walls/floors/ceilings, \
  conveyor belts, translucent walls and sprites, friction effects, \
  and generic linedef actions. \
* Focus on retaining compatibility with the original Doom engines \
  for the purpose of demo recording and playback. \
* High resolution rendering of map geometry, optionally in OpenGL \
  mode."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.66"

RPM_NAME = "prboom-plus-2.6.66-6.5.aarch64.rpm"
RPM_HASH = "a52568a7525926f701a40c8a7b0a553539706b2a74d66cdb63305ae7d86470ffc9e14284a31aacf37f98940177c8baa6d46c0caa92e6d3ea027fa5b3cda19a96"

RPROVIDES:${PN} += "prboom \
prboom-plus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmvec.so.1 \
libportmidi.so.2 \
libstdc++.so.6 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
