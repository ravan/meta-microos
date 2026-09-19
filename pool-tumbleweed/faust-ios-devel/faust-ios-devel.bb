SUMMARY = "Faust iOS build support"
DESCRIPTION = "Faust iOS build support."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "faust-ios-devel-2.88.0-1.1.noarch.rpm"
RPM_HASH = "064d98cea4515a9ef2dcbf51a26322d8f7fcefca314a4228810127ae63ed2fa3b149f71e14e21ad8468a8eef51fd5f6cf2caf7c97e9dbb1c731aa7886e9cef97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faust-ios-devel"

RDEPENDS:${PN} += "faust \
faust-devel"

inherit rpm
