SUMMARY = "A Library for Working with GIF Images"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "libgif7-5.2.2-4.3.aarch64.rpm"
RPM_HASH = "4ba0f9633df3e6e2bef5de9ed6405f0e1073bd8414d7fa3f7cdf5819a8a74a59258c52097635abcc6db594bcb3b6f00ff32b407a306c3125dec9555266197c13"

RPROVIDES:${PN} += "libgif.so.7 \
libgif7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
