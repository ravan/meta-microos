SUMMARY = "Python 3 bindings for libmodulemd"
DESCRIPTION = "This package provides the Python 3 bindings for libmodulemd."
LICENSE = "MIT"

PV = "2.15.2"

RPM_NAME = "python314-libmodulemd-2.15.2-2.3.aarch64.rpm"
RPM_HASH = "fe7adb3a1126b758a88f703388352fb9ba8324db4650ec89b40c4b8a30bdf40fec44861d97d4f1b4bd56e0aed35c6d002abb47760dfc32ba06964dffd57d715c"

RPROVIDES:${PN} += "python314-libmodulemd"

RDEPENDS:${PN} += "python-abi \
python314-gobject \
python314-six \
typelib-1-0-Modulemd-2-0 \
typelib-GLib \
typelib-Modulemd"

inherit rpm
