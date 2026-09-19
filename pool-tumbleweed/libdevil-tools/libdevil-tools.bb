SUMMARY = "Tools that can be used when using DevIL libraries"
DESCRIPTION = "Tools that can be used to work with DevIL libraries and convert various \
formats."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "libdevil-tools-1.7.8-12.13.aarch64.rpm"
RPM_HASH = "78650883095b7ee232656616640888443417a658b7383d72eddf798129cf391ef1bb928cc6d71d072e86db8c8ef9749d4c2c8279ba17fe5fff8a3fef85f550a9"

RPROVIDES:${PN} += "libdevil-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIL.so.1 \
libIL1 \
libILU.so.1 \
libc.so.6"

inherit rpm
