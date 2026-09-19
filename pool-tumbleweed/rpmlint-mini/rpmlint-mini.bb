SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.0+git20260911.f4f012f3"

RPM_NAME = "rpmlint-mini-2.10.0+git20260911.f4f012f3-21.37.aarch64.rpm"
RPM_HASH = "a82a6c793e87d32729687117aba6854857ff7009e3bbfdbe1c1aabf743fb81e92a8a7e3411d9a790c0588401e66a17ea6bede59aba2bb03139fb6cdf775aee4e"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs \
this-is-only-for-build-envs"

inherit rpm
