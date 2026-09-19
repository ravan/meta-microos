SUMMARY = "A simple and lightweight app for running Windows games using UMU-Launcher"
DESCRIPTION = "A simple and lightweight app for running Windows games using UMU-Launcher/UMU-Proton."
LICENSE = "MIT & CC-BY-4.0"

PV = "2.3.0"

RPM_NAME = "faugus-launcher-2.3.0-1.1.noarch.rpm"
RPM_HASH = "4c933a65ec98a4442962e5ec997416a7c7318b923a30bce597e79e2740052bc7eb6ee386764476871bad48b15742574c62599797d010158b12462f31dafabb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faugus-launcher"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python313-Pillow \
python313-base \
python313-dbus-python \
python313-gobject \
python313-icoextract \
python313-psutil \
python313-requests \
python313-vdf \
typelib-Adw \
typelib-Gtk"

inherit rpm
