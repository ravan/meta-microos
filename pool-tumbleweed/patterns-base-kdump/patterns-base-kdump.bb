SUMMARY = "Kernel dump tooling"
DESCRIPTION = "Tools used to trigger and handle kernel dump (kdump)."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-kdump-20241218-34.1.aarch64.rpm"
RPM_HASH = "141c5f16e537fd1428a93bc0963b59eba7af39f6b12e9dae73608720f6dce9ec029c98f56394ebadc8f5bfe60cf909ca7c4142b90f603bb3a4362b34015f0b1d"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-kdump"

RDEPENDS:${PN} += "kdump \
pattern-"

inherit rpm
