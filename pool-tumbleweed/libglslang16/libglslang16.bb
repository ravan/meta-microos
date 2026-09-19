SUMMARY = "OpenGL and OpenGL ES shader front end implementation"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages."
LICENSE = "BSD-3-Clause"

PV = "16.5.0"

RPM_NAME = "libglslang16-16.5.0-1.1.aarch64.rpm"
RPM_HASH = "b1cc13f18e43b3dc6763578a008bbcc3f03028b6c1932c555078ec34ea3879cc7763c3569ae3f113e5fa74baab417aec930b21c5d4208fc27fcdf2c4988fee8d"

RPROVIDES:${PN} += "libSPIRV.so.16 \
libglslang-default-resource-limits.so.16 \
libglslang.so.16 \
libglslang16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
