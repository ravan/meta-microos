SUMMARY = "MIDI Sequencer C++ Library MIME types"
DESCRIPTION = "This package includes a mimetype for Cakewalk project files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "drumstick-mimetypes-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "7f203f4553777289307a7eb99cec65d2209434d26499939cc805cb043b6082a63c1dd4416f28d913e5d41c49b36b39db787812bd5317d5282d79b579178b3ff5"

RPROVIDES:${PN} += "drumstick-mimetypes"

RDEPENDS:${PN} += ""

inherit rpm
