SUMMARY = "Utilies to manage grub"
DESCRIPTION = "This package includes user space utlities to manage GRUB on your system."
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-common-2.14-19.1.aarch64.rpm"
RPM_HASH = "fdbbcd9df3577350cb77ffa0b5b8ed8ce096a19e1f329adf8bb9c7712e352807b2e6a79e55345b33d6d40f4ac5ebe75b550c3f49e4ce4fe8f0cca5816bfa4e09"

RPROVIDES:${PN} += "config-grub2-common \
grub2-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
gettext-runtime \
libc.so.6 \
libdevmapper.so.1.03 \
libfreetype.so.6 \
libfuse3.so.4 \
liblzma.so.5 \
libtasn1.so.6"

inherit rpm
