SUMMARY = "OpenGL and OpenGL ES shader front end and validator"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
spirv-remap is a utility to improve compression of SPIR-V binary \
files via entropy reduction, plus optional stripping of debug \
information and load/store optimization. It transforms SPIR-V to \
SPIR-V, remapping IDs. The resulting modules have an increased ID \
range (IDs are not as tightly packed around zero), but will compress \
better when multiple modules are compressed together, since \
compressor's dictionary can find better cross module commonality."
LICENSE = "BSD-3-Clause"

PV = "16.5.0"

RPM_NAME = "glslang-devel-16.5.0-1.1.aarch64.rpm"
RPM_HASH = "c5439d9aacf7520eebb04307bc02d340e2cef207621c0766a660566da485b741036f9f94d916645c0d5d0f5ffdf08d1a25890b863dfb605ea35cc80194fc619d"

RPROVIDES:${PN} += "cmake-glslang \
glslang-devel"

RDEPENDS:${PN} += "cmake-SPIRV-Tools-opt \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglslang-default-resource-limits.so.16 \
libglslang.so.16 \
libglslang16 \
libstdc++.so.6"

inherit rpm
