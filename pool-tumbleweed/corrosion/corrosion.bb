SUMMARY = "Rust integration into existing CMake project"
DESCRIPTION = "Corrosion, formerly known as cmake-cargo, is a tool for integrating Rust into \
an existing CMake project. Corrosion can automatically import executables, \
static libraries, and dynamic libraries from a workspace or package manifest \
(Cargo.toml file)."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "corrosion-0.6.1-2.2.aarch64.rpm"
RPM_HASH = "39596c3e6825bc2d3c3436f8f10fb1d058aad8c5b8037e0b47baee17abc697a41c0f070036bc3e1f855053f6c186ef707155d829d295fb8335bd524ee4fe3b6e"

RPROVIDES:${PN} += "cmake-Corrosion \
corrosion"

RDEPENDS:${PN} += "cmake"

inherit rpm
