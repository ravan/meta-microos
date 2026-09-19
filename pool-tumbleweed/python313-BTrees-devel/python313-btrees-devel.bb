SUMMARY = "Development files for the python-BTrees module"
DESCRIPTION = "This package contains the files needed for binding the python313-BTrees C module."
LICENSE = "ZPL-2.1"

PV = "6.4"

RPM_NAME = "python313-BTrees-devel-6.4-1.3.aarch64.rpm"
RPM_HASH = "936a212f06cd3cc8fe6d84101c193a1903261161f1e4cc5f31c83a7d449651eee1a7496b727bcb9059c0ca978caca11d34e85428738a4d1bb3d60bb22aea112b"

RPROVIDES:${PN} += "python3-BTrees-devel \
python313-BTrees-devel"

RDEPENDS:${PN} += "python313-BTrees"

inherit rpm
