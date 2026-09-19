SUMMARY = "Visualization ToolKit for Many-cores (vtk-m) run-time libraries"
DESCRIPTION = "VTK-m is a toolkit of scientific visualization algorithms for emerging \
processor architectures. \
 \
This package provides the shared libraries for VTK-m."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "libvtk-m-openmpi4-2_3-2.3.0-2.4.aarch64.rpm"
RPM_HASH = "600e059a4a3f6c17c7b1d698e9aee563f37bddb21cc42debd5f90ba1de5e3b875ee1ddeb38c86eadb8e0de4f970a1ff15f8f243bb389eec9e65f794ef9ae96c0"

RPROVIDES:${PN} += "libvtk-m-openmpi4-2-3 \
libvtkm-cont-testing.so.2.3 \
libvtkm-cont.so.2.3 \
libvtkm-filter-clean-grid.so.2.3 \
libvtkm-filter-connected-components.so.2.3 \
libvtkm-filter-contour.so.2.3 \
libvtkm-filter-core.so.2.3 \
libvtkm-filter-density-estimate.so.2.3 \
libvtkm-filter-entity-extraction.so.2.3 \
libvtkm-filter-field-conversion.so.2.3 \
libvtkm-filter-field-transform.so.2.3 \
libvtkm-filter-flow.so.2.3 \
libvtkm-filter-geometry-refinement.so.2.3 \
libvtkm-filter-image-processing.so.2.3 \
libvtkm-filter-mesh-info.so.2.3 \
libvtkm-filter-multi-block.so.2.3 \
libvtkm-filter-resampling.so.2.3 \
libvtkm-filter-scalar-topology.so.2.3 \
libvtkm-filter-uncertainty.so.2.3 \
libvtkm-filter-vector-analysis.so.2.3 \
libvtkm-filter-zfp.so.2.3 \
libvtkm-io.so.2.3 \
libvtkm-rendering-testing.so.2.3 \
libvtkm-rendering.so.2.3 \
libvtkm-source.so.2.3 \
libvtkm-worklet.so.2.3 \
libvtkmdiympi.so.2.3"

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
