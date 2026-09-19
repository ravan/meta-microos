SUMMARY = "Post transaction actions Plugin for DNF"
DESCRIPTION = "Post transaction actions Plugin for DNF, Python 3 version. Plugin runs actions \
(shell commands) after transaction is completed. Actions are defined in action \
files."
LICENSE = "GPL-2.0-or-later"

PV = "4.10.1"

RPM_NAME = "python3-dnf-plugin-post-transaction-actions-4.10.1-1.6.noarch.rpm"
RPM_HASH = "427839cc5658138182becb7c9abfe69b753e5f3d39ed2eaee4bab5cd8dc3b021c1946dbe03299d0d39ff21f54f0b7d76c7b47baa0856f66a3637ac7cd2bbde7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-dnf-plugin-post-transaction-actions \
dnf-plugin-post-transaction-actions \
python3-dnf-plugin-post-transaction-actions"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-core"

inherit rpm
