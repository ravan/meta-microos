SUMMARY = "A library to access Tryton's modules like a client"
DESCRIPTION = "Proteus allows you to access Tryton's modules like a client. Useful for automation, data load etc."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "proteus-7.0.3-1.2.noarch.rpm"
RPM_HASH = "a5d9cb8afa0e44fbaa5199c90dec6a5df81c5953fdd9419f093cb6461742a6d30bc1aceced33ab53060583d990fa65314172b518a282c4d9213b0b48b9b29c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proteus \
python3.13dist-proteus \
python3dist-proteus"

RDEPENDS:${PN} += "python-abi \
python3-defusedxml \
python3-python-dateutil \
trytond"

inherit rpm
