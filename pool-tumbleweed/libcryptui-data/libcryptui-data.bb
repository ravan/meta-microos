SUMMARY = "Data files for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-data-3.12.2-12.7.aarch64.rpm"
RPM_HASH = "6d979d5e731bec871fcf9bdd6ec96b4c4c8e56f6ed7172ba5d3aeb2c8b06ad32cbe8f11b6cba28be67ec4f30ae913e3ca030ff5c2d94af4bd12bd5b9f2791af6"

RPROVIDES:${PN} += "libcryptui-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
