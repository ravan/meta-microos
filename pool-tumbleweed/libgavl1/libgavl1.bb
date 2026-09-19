SUMMARY = "Library which provides basic support for uncompressed multimedia data"
DESCRIPTION = "Gavl is short for Gmerlin Audio Video Library. It is a low level library, upon \
which multimedia APIs can be built. Gavl handles all the details of audio and \
video formats like colorspaces, samplerates, multichannel configurations etc. It \
provides standardized definitions for those formats as well as container \
structures for carrying audio samples or video images inside an application. \
 \
In addition, it handles the sometimes ugly task to convert between all these \
formats and provides some elementary operations (copying, scaling, alpha"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0rsvn4256"

RPM_NAME = "libgavl1-1.4.0rsvn4256-3.9.aarch64.rpm"
RPM_HASH = "1787b437179ce512b2ae7f416c2513072815c90a4f6a4dd361ed22a3e5c1a1a4977cd1d6c6ca1c9d56dea39a4e15d997d64eb31b0bc081171b13a8d8efcb9baf"

RPROVIDES:${PN} += "libgavl.so.1 \
libgavl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libm.so.6"

inherit rpm
