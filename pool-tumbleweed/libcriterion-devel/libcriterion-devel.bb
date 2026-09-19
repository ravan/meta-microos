SUMMARY = "Devel files for Criterion"
DESCRIPTION = "Contains all needed devel files for Criterion."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "libcriterion-devel-2.4.3-1.5.aarch64.rpm"
RPM_HASH = "2a57cd31ad924f6e0f85feab1ac9289d5e4c87550474df3e179f17f29215186091bd7f4618d45189ed5e520695584d1bd01455079d16a0cccf12b54a12e1dec1"

RPROVIDES:${PN} += "libcriterion-devel \
libcriterion3-devel \
pkgconfig-criterion"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcriterion3 \
pkgconfig-boxfort \
pkgconfig-libffi \
pkgconfig-libgit2 \
pkgconfig-nanomsg"

inherit rpm
