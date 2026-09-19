SUMMARY = "Abseil library liblibabsl_spinlock_wait"
DESCRIPTION = "This package contains the libabsl_spinlock_wait library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_spinlock_wait2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "2b1ad9e6488833e70632e26be5f58a1d0ecc150b5865f8ab1213960364b186f5c2805fd1e75541539bd0daa3e8c289ca6bcfcf898379b8afb3cb415ee8d1a43f"

RPROVIDES:${PN} += "libabsl-spinlock-wait.so.2608.0.0 \
libabsl-spinlock-wait2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
