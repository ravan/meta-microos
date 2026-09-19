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

RPM_NAME = "vtk-java-devel-9.6.1-2.2.aarch64.rpm"
RPM_HASH = "03e3df7fa75c7d7c38fda2792aad860049292e700453ad52de809e37d386be57fdc372a29f490817a000f850364287da1df40705f1ce7b006d4a0d7f24cada14"

RPROVIDES:${PN} += "vtk-devel-/usr/lib64/libvtkJava.so \
vtk-java-devel"

RDEPENDS:${PN} += "java-devel \
vtk-devel \
vtk-java"

inherit rpm
