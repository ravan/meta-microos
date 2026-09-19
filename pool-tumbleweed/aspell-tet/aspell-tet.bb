SUMMARY = "Tetum (Tetun) Dictionary for Aspell"
DESCRIPTION = "A Tetum (Tetun) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "aspell-tet-0.1.1-4.7.aarch64.rpm"
RPM_HASH = "02709ab4482e8f96125dbd1114dd961700d5b795cf8492aae9aface07d6b14cf41b59d6ab92c34727dd45b6295816938efe6d2172f9ebc17f3e56ebad53cb24b"

RPROVIDES:${PN} += "aspell-tet \
locale-aspell-tet"

RDEPENDS:${PN} += ""

inherit rpm
