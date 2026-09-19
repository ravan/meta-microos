SUMMARY = "A command line interface tasks manager"
DESCRIPTION = "TuDu is a command line interface to manage hierchical todos. \
Each task has a title and description, a deadline and scheduled date as well \
as categories and priorities."
LICENSE = "GPL-3.0-only"

PV = "0.10.4"

RPM_NAME = "tudu-0.10.4-2.9.aarch64.rpm"
RPM_HASH = "b3ec9951aa97ce49ead163812227f68fdc3f9b497bcb79df53071e307067dfdfd64ed1134314f02fc71debfdf0119249b6280ca8f0b59029d581e8044030cbb9"

RPROVIDES:${PN} += "config-tudu \
tudu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
