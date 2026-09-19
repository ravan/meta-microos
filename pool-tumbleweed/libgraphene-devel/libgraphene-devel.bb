SUMMARY = "Development files for libgraphene, a thin type layer for graphic libraries"
DESCRIPTION = "The Graphene library provides types and their relative API for affine \
matrices, 4×4 matrices, projections, transformations, vectors and \
quaternions. \
 \
This subpackage contains the development files for the Graphene library."
LICENSE = "MIT"

PV = "1.10.8"

RPM_NAME = "libgraphene-devel-1.10.8-3.1.aarch64.rpm"
RPM_HASH = "9c218e2bb9bc894b12b87275a93b576584cb0b42e8e4a8b23826c476633613195686f13e9acacdbeeb2291216ae7422dea00b920195d0a1e527ce3f6bf66b066"

RPROVIDES:${PN} += "libgraphene-devel \
pkgconfig-graphene-1.0 \
pkgconfig-graphene-gobject-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgraphene-1-0-0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphene-1.0 \
typelib-1-0-Graphene-1-0"

inherit rpm
