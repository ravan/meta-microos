SUMMARY = "Fish Completion for zola"
DESCRIPTION = "Fish command-line completion support for zola."
LICENSE = "MIT"

PV = "0.23.3"

RPM_NAME = "zola-fish-completion-0.23.3-1.2.noarch.rpm"
RPM_HASH = "862a5da389dcd3aa28105fff870907e60b4512afe4d754fb3d576bbeb40c9424c84dac2152d7a3004b567f72503bd7a3140cd64deab9b79c52fb83a0d51aeb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
