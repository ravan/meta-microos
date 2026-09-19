SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply-boot-client library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply-boot-client5-22.02.122+94.4bd41a3-20.6.aarch64.rpm"
RPM_HASH = "aac303fcae081318a5e42e20ca950e639da381d31ac0e5dd3f52a8578ff0e8892398a8c4bb3dd71ec7fad71700ed4b4f2ab80818a572943b96f0dc191bb2e8b1"

RPROVIDES:${PN} += "libply-boot-client.so.5 \
libply-boot-client5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libply.so.5"

inherit rpm
