SUMMARY = "Common RPM macros for zig0.15"
DESCRIPTION = "This package contains common RPM macros for zig in version 0.15.2."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "zig-rpm-macros0.15-0.15.2-3.1.noarch.rpm"
RPM_HASH = "e3339cdcc5b66d9191153bae25970993a15d2d53331bebaadb9b7f3e5aa622d60746f4913c57f9f4e610e6c4a3decf0b23322903828ebeb69cc25d0835cffb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro--zig-advanced-options \
rpm-macro--zig-build-options \
rpm-macro--zig-cpu \
rpm-macro--zig-general-options \
rpm-macro--zig-install-options \
rpm-macro--zig-project-options \
rpm-macro--zig-target \
rpm-macro--zig-version \
rpm-macro-zig-arches \
rpm-macro-zig-build \
rpm-macro-zig-install \
rpm-macro-zig-test \
zig-rpm-macros \
zig-rpm-macros-implementation \
zig-rpm-macros0.15"

RDEPENDS:${PN} += "rpm"

inherit rpm
