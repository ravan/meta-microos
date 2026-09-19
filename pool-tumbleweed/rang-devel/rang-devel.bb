SUMMARY = "A C++ library for color emission in the terminal"
DESCRIPTION = "A minimal, header only C++ library for emitting colors in the terminal."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.3"

RPM_NAME = "rang-devel-3.3-1.2.aarch64.rpm"
RPM_HASH = "6e2e6016f9b9261310f9e8abd15a849a5af34d0da5a8d0c42a0fa64bfe50f77fa1f258fd49b78682425b2786dd94366d36b24fa102fe82869bca7de787005326"

RPROVIDES:${PN} += "pkgconfig-rang \
rang-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
