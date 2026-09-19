SUMMARY = "Utilities used by libzypp to manage .solv files"
DESCRIPTION = "This subpackage contains utilities used by libzypp to manage solv files."
LICENSE = "BSD-3-Clause"

PV = "0.7.39"

RPM_NAME = "libsolv-tools-base-0.7.39-1.4.aarch64.rpm"
RPM_HASH = "628d89b29d5ed5ffb7901ffd6ca274daabf55d746be59ab921b54a703ad640c0881b694d0db74dd6b718815af77769ecabdb9cbfe6cb7224102d938b6e2e3f51"

RPROVIDES:${PN} += "libsolv-tools-/usr/bin/repo2solv \
libsolv-tools-base"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.10 \
librpmio.so.10 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
