SUMMARY = "Lua-based build system"
DESCRIPTION = "Bam is a build system focusing on arbitrary build scripts. Instead of \
having a custom language, it uses Lua to describe the build steps."
LICENSE = "Zlib"

PV = "0.5.1"

RPM_NAME = "bam-0.5.1-5.14.aarch64.rpm"
RPM_HASH = "e96cba2818192eea724a3c298817a8d6c6c6cacf1800d9915b05ec95c288fdda613d1350eb329ffc5e2d74e6caa1067451338706161dcc5ba0a6d02d48a995a6"

RPROVIDES:${PN} += "bam"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5"

inherit rpm
