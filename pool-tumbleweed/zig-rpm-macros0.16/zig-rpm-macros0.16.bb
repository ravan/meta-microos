SUMMARY = "Common RPM macros for zig0.16"
DESCRIPTION = "This package contains common RPM macros for zig in version 0.16.0."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "zig-rpm-macros0.16-0.16.0-2.1.noarch.rpm"
RPM_HASH = "688225d5b0eeb5b8d5dd712cf33e63d2b5123c0e73d6737193ab78a8df7a435b5ef9960d21992c0c788806405c685fb14fad5c78cb05d1c63b87fad9f3c8bc21"
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
zig-rpm-macros0.16"

RDEPENDS:${PN} += "rpm"

inherit rpm
