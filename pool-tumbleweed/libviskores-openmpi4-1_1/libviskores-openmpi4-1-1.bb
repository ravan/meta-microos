SUMMARY = "Visualization Kernels for Rendering and Simulation run-time libraries"
DESCRIPTION = "Viskores is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for Viskores."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "libviskores-openmpi4-1_1-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "a42f98247041886810cf5d3081a6017c5d385c5f6a8c5e710c3825b87e63bc6e22a587c003bd17f5080e07d9936c958dd4cbfc85a30c7f94f288a5e9ed6f680d"

RPROVIDES:${PN} += "libviskores-cont-testing.so.1.1 \
libviskores-cont.so.1.1 \
libviskores-filter-clean-grid.so.1.1 \
libviskores-filter-connected-components.so.1.1 \
libviskores-filter-contour.so.1.1 \
libviskores-filter-core.so.1.1 \
libviskores-filter-density-estimate.so.1.1 \
libviskores-filter-entity-extraction.so.1.1 \
libviskores-filter-field-conversion.so.1.1 \
libviskores-filter-field-transform.so.1.1 \
libviskores-filter-flow.so.1.1 \
libviskores-filter-geometry-refinement.so.1.1 \
libviskores-filter-image-processing.so.1.1 \
libviskores-filter-mesh-info.so.1.1 \
libviskores-filter-multi-block.so.1.1 \
libviskores-filter-resampling.so.1.1 \
libviskores-filter-scalar-topology.so.1.1 \
libviskores-filter-uncertainty.so.1.1 \
libviskores-filter-vector-analysis.so.1.1 \
libviskores-filter-zfp.so.1.1 \
libviskores-io.so.1.1 \
libviskores-openmpi4-1-1 \
libviskores-rendering-testing.so.1.1 \
libviskores-rendering.so.1.1 \
libviskores-source.so.1.1 \
libviskores-worklet.so.1.1 \
libviskoresdiympi.so.1.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
openmpi4"

inherit rpm
