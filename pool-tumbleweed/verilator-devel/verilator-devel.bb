SUMMARY = "Verilator library header files"
DESCRIPTION = "Development files for Verilator, a compiling Verilog HDL simulator. \
It includes header files and a pkgconfig file."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "5.038"

RPM_NAME = "verilator-devel-5.038-1.6.noarch.rpm"
RPM_HASH = "b359dfff3d843dcdb6bf5f25e0c17d9f5250d7dbb69082e1caa3d0bd07ad109c5c2da22aa2c396d2965610c362e40d483331d8d6206f2641be854e9a5cf079c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-verilator \
verilator-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
verilator"

inherit rpm
