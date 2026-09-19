SUMMARY = "Compiler infrastructure and toolchain library for WebAssembly"
DESCRIPTION = "Binaryen is a compiler and toolchain infrastructure library for WebAssembly, \
written in C++, for compiling WebAssembly. \
 \
* Binaryen has a single header C API. It accepts input in WebAssembly-like form, \
  but also accepts a general control flow graph for compilers that prefer that. \
* Binaryen's internal IR uses compact data structures and is designed for \
  completely parallel codegen and optimization, using all available CPU cores. \
* Binaryen IR compiles down to WebAssembly easily and quickly because it is \
  a subset of WebAssembly. \
* Effective: Binaryen's optimizer has many passes that can improve code (e.g. \
  local coloring to coalesce local variables, dead code elimination; precomputing \
  expressions when possible at compile time; etc.). \
* WASM minification \
 \
Compilers built using Binaryen include: \
 \
* s2wasm which compiles the LLVM WebAssembly's backend .s output format \
* mir2wasm which compiles Rust MIR \
 \
Those compilers generate Binaryen IR, which can then be optimized and \
emitted as WebAssembly (the first two use the internal C++ API, the \
last the C API). \
 \
Binaryen provides a toolchain that can: \
 \
* Parse and emit WebAssembly. Users can load WebAssembly, optimize it \
  using Binaryen, and re-emit it, thus implementing a wasm-to-wasm optimizer. \
* Interpret WebAssembly as well as run the WebAssembly spec tests. \
* Integrate with Emscripten in order to provide a complete compiler \
  toolchain from C and C++ to WebAssembly. \
* Polyfill WebAssembly by running it in the interpreter compiled to JavaScript, \
  if the browser does not yet have native support (useful for testing)."
LICENSE = "Apache-2.0"

PV = "123"

RPM_NAME = "binaryen-123-1.6.aarch64.rpm"
RPM_HASH = "02a9780fd63ed64ee9d207641d2263ca36af8100f332fd2f7d62960f9398a35d3d9fc370a31408260a41dc8421677b5cbe6df05d8a7b626696d960ce17b8b170"

RPROVIDES:${PN} += "binaryen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbinaryen \
libbinaryen.so \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
