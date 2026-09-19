SUMMARY = "GObject introspection for libgraphene, a thin type layer for graphic libraries"
DESCRIPTION = "The Graphene library provides types and their relative API for affine \
matrices, 4×4 matrices, projections, transformations, vectors and \
quaternions."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "typelib-1_0-Graphene-1_0-1.10.8-3.1.aarch64.rpm"
RPM_HASH = "136fd0158ea9e205fe6f03f696e6615368c164e30070a921e17465237d4f174de52d39fa84b9948c53b65eb8472158cae8872e2753c5a28b3faf47e59153c23a"

RPROVIDES:${PN} += "typelib-1-0-Graphene-1-0 \
typelib-Graphene"

RDEPENDS:${PN} += "libgraphene-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
