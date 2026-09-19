SUMMARY = "Documentation for cutmp3"
DESCRIPTION = "This is a program to edit MP3 files without quality loss, using an \
ncurses-based user interface. \
 \
This package contains a user guide and a list of key bindings for cutmp3"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "cutmp3-doc-3.0.3-2.5.noarch.rpm"
RPM_HASH = "18a9ca6a0c367f674e7d5eed91b6ce566ac9cc84fb797ca422dea572261a8dc820d960c86d0878b786308121d63c1a4214581d32eb04a745713435185ecedad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cutmp3-doc"

RDEPENDS:${PN} += "cutmp3"

inherit rpm
