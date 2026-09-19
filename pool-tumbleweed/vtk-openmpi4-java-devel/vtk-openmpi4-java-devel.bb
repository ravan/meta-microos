SUMMARY = "Develoment files for VTK Java bindings"
DESCRIPTION = "VTK is a software system for image processing, 3D graphics, volume \
rendering and visualization. VTK includes many advanced algorithms \
(e.g. surface reconstruction, implicit modelling, decimation) and \
rendering techniques (e.g. hardware-accelerated volume rendering, \
LOD control). \
 \
This provides the Java part of the development files."
LICENSE = "BSD-3-Clause"

PV = "9.6.1"

RPM_NAME = "vtk-openmpi4-java-devel-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "ed46ad6671a823adc9391d84ef4b53ca009d5576ed113e853e12efc7f8a6c9a6352b59c469ff321ad5da2e3f930da9e5ea707f20b814cd9924cfc5c605501377"

RPROVIDES:${PN} += "vtk-openmpi4-devel-/usr/lib64/mpi/gcc/openmpi4/lib64//libvtkJava.so \
vtk-openmpi4-java-devel"

RDEPENDS:${PN} += "java-devel \
vtk-openmpi4-devel \
vtk-openmpi4-java"

inherit rpm
