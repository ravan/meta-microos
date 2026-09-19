SUMMARY = "VDE plug library"
DESCRIPTION = "This package contains a library that makes programs able to connect \
to a local VDE switch. The simplest one is vde_plug, contained in the vde2 package."
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdeplug3-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "ebc840c4ea88159ea11d5dbdc6db686bf6a5fe89f08e7a98ddf0d9f08eeff9294e156f6893081f4884d41c3255373dd398d89f72f91e0666faeb6b53b73251de"

RPROVIDES:${PN} += "libvdeplug.so.3 \
libvdeplug3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
