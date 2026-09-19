SUMMARY = "Developmnt files for upb"
DESCRIPTION = "μpb (often written 'upb') is a small protobuf implementation written in C. \
 \
upb generates a C API for creating, parsing, and serializing messages as \
declared in .proto files. upb is heavily arena-based: all messages always live \
in an arena (note: the arena can live in stack or static memory if desired). \
 \
This package provides development files for upb."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "upb-devel-1.76.0-3.12.aarch64.rpm"
RPM_HASH = "02b6a8469938dd63664ccdf293e2a84468a7f16abe508e81e3fdf17a19b118d2460da19368eb8d22459ba78476ab9a67a961aeec8df6050bd3a8a3385d8ff185"

RPROVIDES:${PN} += "upb-devel"

RDEPENDS:${PN} += "libupb51"

inherit rpm
