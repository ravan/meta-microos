SUMMARY = "RPM repository metadata generation utility"
DESCRIPTION = "C implementation of Createrepo. \
A set of utilities (createrepo_c, mergerepo_c, modifyrepo_c) \
for generating a common metadata repository from a directory of \
rpm packages and maintaining it."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "createrepo_c-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "95f3d6e469eb728edd35e37c9b39a2a6531466aa160309487f5b33ff104622956ef90920f68d0b02785d22dc2365994d005e2e386193d461334602dacaeb6463"

RPROVIDES:${PN} += "createrepo \
createrepo-c \
createrepo-implementation"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcreaterepo-c.so.1 \
libcreaterepo-c1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmodulemd.so.2 \
update-alternatives"

inherit rpm
