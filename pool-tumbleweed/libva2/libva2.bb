SUMMARY = "Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the core runtime library."
LICENSE = "MIT"

PV = "2.24.1"

RPM_NAME = "libva2-2.24.1-1.1.aarch64.rpm"
RPM_HASH = "bf12c98ef22a30f4b72dc453be642a42e540cd4ac988787306d5f3c2443d80a839c4401e3769b4fdab36ef237f8241bbf7e8cc7adc6b68fa8b1fd268e0b0c1f9"

RPROVIDES:${PN} += "libva.so.2 \
libva2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
