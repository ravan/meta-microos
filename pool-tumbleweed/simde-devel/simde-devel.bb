SUMMARY = "Fallback implementation for SIMD intrinsics"
DESCRIPTION = "The SIMDe header-only library provides fast, portable implementations of SIMD \
intrinsics on hardware which do not natively support them, such as calling \
SSE functions on ARM. There is no performance penalty if the hardware supports \
the native implementation (e.g. SSE/AVX runs at full speed on x86, NEON on \
ARM, etc.)."
LICENSE = "MIT"

PV = "0.8.4+git20260414.2214c660"

RPM_NAME = "simde-devel-0.8.4+git20260414.2214c660-1.2.aarch64.rpm"
RPM_HASH = "57c39843b36d66f632cc0a5a17bb5786c83f95ae4588e6f8f1a60670be867efba7cec3ffdc3c4dc5c98a24551aea8eb523d908828d2f635e04e9c614b9bb6ea7"

RPROVIDES:${PN} += "pkgconfig-simde \
simde-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
