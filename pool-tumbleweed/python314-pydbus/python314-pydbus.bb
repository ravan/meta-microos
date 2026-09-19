SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python314-pydbus-0.6.0-2.5.noarch.rpm"
RPM_HASH = "f2f164412bd806027a91c167217e1ba6b06faf8c35ad3a7f995e4318a78016f5f43fe0e1aaea7f7d9d655837f527c0864bacba4600c527b1006e7c2599bb0b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydbus \
python314-pydbus \
python3dist-pydbus"

RDEPENDS:${PN} += "girepository-1-0 \
python-abi \
python314-gobject"

inherit rpm
