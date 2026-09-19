SUMMARY = "Common RPM macros for zig0.14"
DESCRIPTION = "This package contains common RPM macros for zig in version 0.14.1."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "zig-rpm-macros0.14-0.14.1-2.3.noarch.rpm"
RPM_HASH = "6f388406971f405e30be12de55c8f77b5125865b976d0ade90983276da747b87962c0a08938e85c9313ce05a877994734259fb5c2ce30ac51475760664d578a6"
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
zig-rpm-macros0.14"

RDEPENDS:${PN} += "rpm"

inherit rpm
