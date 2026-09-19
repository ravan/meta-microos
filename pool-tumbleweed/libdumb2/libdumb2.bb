SUMMARY = "Tracker module player library"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library. \
 \
This package contains the shared libraries for dumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libdumb2-2.0.3-1.19.aarch64.rpm"
RPM_HASH = "c05c0a97b24efe7ddc46e321093726e5450d7bbceef0e42199f29b83320ff381ca59f9320fcc23c9bb53b0fcd1ceb2306f51bd4605a462cf75903cffa90fe74f"

RPROVIDES:${PN} += "libdumb.so.2 \
libdumb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
