SUMMARY = "Package manager and meta build tool for the D programming language"
DESCRIPTION = "Package Manager for the D Programming language. \
DUB emerged as a more general replacement for vibe.d's package manager. \
It does not imply a dependecy to vibe.d for packages and was extended to \
not only directly build projects, but also to generate project files \
(currently VisualD). Mono-D also support the use of dub.json \
(dub's package description) as project file."
LICENSE = "MIT"

PV = "1.42.0"

RPM_NAME = "dub-1.42.0-1.1.aarch64.rpm"
RPM_HASH = "fa00c4daaaa0d47b71a748c140935ff97225ae1240dc87875831303c2e04dc06aac0faa0bece127f64ced4e13c21aae825883afab9b3077f830538833a3bb939"

RPROVIDES:${PN} += "dub"

RDEPENDS:${PN} += "libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1 \
libphobos2-ldc-shared.so.112"

inherit rpm
