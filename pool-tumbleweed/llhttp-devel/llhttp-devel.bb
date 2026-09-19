SUMMARY = "Development files for llhttp library"
DESCRIPTION = "Port of http_parser to llparse \
 \
This package contains the development files."
LICENSE = "MIT"

PV = "9.3.1"

RPM_NAME = "llhttp-devel-9.3.1-1.3.aarch64.rpm"
RPM_HASH = "486708beebc8cc06728ce7524cddbf008e5802e42f692c336bce0cf828d359dace70664a47a2b52d36d4bd0fe8c7afafcf6b3f66263d112a7f11edcf8ccaead9"

RPROVIDES:${PN} += "cmake-llhttp \
llhttp-devel \
pkgconfig-libllhttp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libllhttp9-3"

inherit rpm
