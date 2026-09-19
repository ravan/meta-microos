SUMMARY = "This package provides documentation for LuminanceHDR"
DESCRIPTION = "This package contains the documentation for Luminance HDR."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.0+git313.634b489"

RPM_NAME = "LuminanceHDR-doc-2.6.0+git313.634b489-4.1.noarch.rpm"
RPM_HASH = "4406f144c8d220dc7768b096735ecead60b2900641c00fc849c084f404e8d5751397ead25a0d17e0b22be151caeb9344e68b80eebec8b20b626659fee7f2404f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LuminanceHDR-doc"

RDEPENDS:${PN} += ""

inherit rpm
