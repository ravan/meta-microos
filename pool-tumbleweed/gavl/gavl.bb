SUMMARY = "Library which provides basic support for uncompressed multimedia data"
DESCRIPTION = "Gavl is short for Gmerlin Audio Video Library. It is a low level library, upon \
which multimedia APIs can be built. Gavl handles all the details of audio and \
video formats like colorspaces, samplerates, multichannel configurations etc. It \
provides standardized definitions for those formats as well as container \
structures for carrying audio samples or video images inside an application. \
 \
In addition, it handles the sometimes ugly task to convert between all these \
formats and provides some elementary operations (copying, scaling, alpha \
blending etc)."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0rsvn4256"

RPM_NAME = "gavl-1.4.0rsvn4256-3.9.aarch64.rpm"
RPM_HASH = "879e1249b4d6e135fcc20e4f90af96266a10340dee6644a1f5d5f64f4a669cf6033252e37cea61733ffac45407935a82412225fa4c7f635b2f63517727399cf5"

RPROVIDES:${PN} += "gavl"

RDEPENDS:${PN} += "libc.so.6 \
libgavl.so.1"

inherit rpm
