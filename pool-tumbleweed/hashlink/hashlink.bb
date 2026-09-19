SUMMARY = "A virtual machine for Haxe"
DESCRIPTION = "HashLink is a virtual machine for Haxe. \
Haxe supports two modes of compilation for HashLink: \
* Compilation to HashLink bytecode. This mode has a very fast compilation time, \
  so it is suitable for daily development. \
* Compilation to HashLink/C code, compiled with a native compiler to a regular \
  executable. This mode results in the best performance, so it is suitable for \
  final releases."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "hashlink-1.15-4.2.aarch64.rpm"
RPM_HASH = "2e31d01668fcdfec61dfcd2e7815852920e3d78774ba2504d8086fed1bd3f9d634a74769312ec946555bbfa2eead6d446217e4c5bfd225e458ba7d87a4c3254a"

RPROVIDES:${PN} += "hashlink"

RDEPENDS:${PN} += "hashlink-hdlls"

inherit rpm
