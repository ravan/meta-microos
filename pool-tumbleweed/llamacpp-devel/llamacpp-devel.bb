SUMMARY = "Development files for llama.cpp"
DESCRIPTION = "Development files for llama.cpp"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "llamacpp-devel-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "f6a212fc8b13adecee8c4453225bc0ae0c2d7e650aa465d223156e5a0cea9700e2f35bb47c263b037b575e076c98c821fb172fa146d3439ba44889dd77fb51cb"

RPROVIDES:${PN} += "cmake-llama \
llamacpp-devel \
pkgconfig-llama"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
