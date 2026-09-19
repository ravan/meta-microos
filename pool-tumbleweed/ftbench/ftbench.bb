SUMMARY = "Run FreeType benchmarks"
DESCRIPTION = "Run FreeType benchmarks \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftbench-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "da3f27a428704d5a07a0baa8b3ae455617f08d45de1b4a4fade8962e4d744652b9bef15ff4da6edb962520aec4aca8c1a4d129a8fb82fdac22ddc99fe1c20f7c"

RPROVIDES:${PN} += "ftbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
