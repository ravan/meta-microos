SUMMARY = "Mesh optimization library that makes meshes smaller and faster to render"
DESCRIPTION = "When a GPU renders triangle meshes, various stages of the GPU pipeline have to \
process vertex and index data. The efficiency of these stages depends on the \
data you feed to them; this library provides algorithms to help optimize meshes \
for these stages, as well as algorithms to reduce the mesh complexity and \
storage overhead. \
 \
The library provides a C and C++ interface for all algorithms; you can use it \
from C/C++ or from other languages via FFI (such as P/Invoke). If you want to \
use this library from Rust, you should use meshopt crate. JavaScript interface \
for some algorithms is available through meshoptimizer.js. \
 \
Two companion projects are developed and distributed alongside the library: \
gltfpack, a command-line tool that automatically optimizes glTF files, and \
clusterlod.h, a single-header C/C++ library for continuous level of detail \
using clustered simplification."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "meshoptimizer-1.2-1.2.aarch64.rpm"
RPM_HASH = "1bf721b03a9e92dc3390ceed007bf6d851a20a729510ff60a83623751dea122ecb63bde89587154fe601615d06401a7d899e4ee6f2c5c07a07571d609d2bb59c"

RPROVIDES:${PN} += "meshoptimizer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmeshoptimizer.so.1.2 \
libstdc++.so.6"

inherit rpm
