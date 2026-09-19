SUMMARY = "Development files for Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libsingular_resources-devel-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "a913807a6cf588b11a5b0b1f01b7eee78f9e4aad5e9047c4554e2aeca00bfd9742b4bb944e225cecf1539ebd8c2384602091f20d73d328cdc17598ae4dce8f8e"

RPROVIDES:${PN} += "libsingular-resources-devel \
pkgconfig-singular-resources"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsingular-resources-4-4-1"

inherit rpm
