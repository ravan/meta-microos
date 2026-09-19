SUMMARY = "Development files for libXNVCtrl"
DESCRIPTION = "This devel package contains libraries and header files for \
developing applications that use the NV-CONTROL API."
LICENSE = "GPL-2.0-only"

PV = "580.159.03"

RPM_NAME = "nvidia-libXNVCtrl-devel-580.159.03-1.3.aarch64.rpm"
RPM_HASH = "3d288b3fbc2481cf5574c0d87cb5c3a7a2d393fb18e4ba6dfa3407456f2e17a0014389c7594af064b286b6b2547269f7017143163424c8514cc3e1c8cfebce2b"

RPROVIDES:${PN} += "libXNVCtrl-devel \
nvidia-libXNVCtrl-devel"

RDEPENDS:${PN} += "libX11-devel \
nvidia-libXNVCtrl"

inherit rpm
