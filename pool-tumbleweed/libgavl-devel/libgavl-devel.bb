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

RPM_NAME = "libgavl-devel-1.4.0rsvn4256-3.9.aarch64.rpm"
RPM_HASH = "cfba95ddd972bdb09bd710014ffe99fa6ad31bc0a29ab9bf57be3cd4d49c9c94d5b470190c5324eec506631fcfbcb4edc44ea3fef515273da3900f7389cbee6a"

RPROVIDES:${PN} += "libgavl-devel \
pkgconfig-gavl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgavl1"

inherit rpm
