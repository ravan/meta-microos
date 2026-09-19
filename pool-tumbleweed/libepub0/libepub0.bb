SUMMARY = "A library for reading ebook files"
DESCRIPTION = "libepub library is needed for okular to support ebook format."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "libepub0-0.2.2-9.8.aarch64.rpm"
RPM_HASH = "c6d54ade0e770d5bbb97293b3b47d6f0fa07719b15fd04cfdd67cd22d393749a1fc06b174e951a81703424da34447c85963447b910cd8911293627b46936406d"

RPROVIDES:${PN} += "libepub.so.0 \
libepub0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libzip.so.5"

inherit rpm
