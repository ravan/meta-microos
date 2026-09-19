SUMMARY = "Sparse volume data structure library"
DESCRIPTION = "Alembic distills complex, animated scenes into a non-procedural, application- \
independent set of baked geometric results. This ‘distillation’ of scenes into \
baked geometry is exactly analogous to the distillation of lighting and \
rendering scenes into rendered image data."
LICENSE = "BSD-3-Clause"

PV = "1.8.8"

RPM_NAME = "libAlembic1_8-1.8.8-1.9.aarch64.rpm"
RPM_HASH = "d8fdfda640c0d883ecf34a0cd4809222840ef7ae14513e411a4406cc0a512c479a7348887c3373b0ac1a2a720884b5e02aa7366e21af2a0780cf9373b7354b04"

RPROVIDES:${PN} += "libAlembic.so.1.8 \
libAlembic1-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
