SUMMARY = "Development files for wlcs"
DESCRIPTION = "wlcs is a protocol conformance verifying test suite usable by Wayland \
compositor implementors. \
 \
The wlcs-devel package contains header files for developing \
Wayland compositor tests that use wlcs."
LICENSE = "GPL-3.0-only & GPL-2.0-only"

PV = "1.7.0"

RPM_NAME = "wlcs-devel-1.7.0-1.12.aarch64.rpm"
RPM_HASH = "2eb7174c4212400fd622963f2300ad0df2856d7b2bc373274457af27de93170dacf5184ab1978858461ae25640b6e587c5cf97c4495cfbc3ab816478645c49a8"

RPROVIDES:${PN} += "pkgconfig-wlcs \
wlcs-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-wayland-client \
wlcs"

inherit rpm
