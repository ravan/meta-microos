SUMMARY = "Documentation for Advanced Gtk+ Sequencer"
DESCRIPTION = "Advanced Gtk+ Sequencer library development documentation."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "8.4.2"

RPM_NAME = "gsequencer-devel-doc-8.4.2-1.2.noarch.rpm"
RPM_HASH = "96f507399a14809b9e32dc93b313cd51640e36a1f73d21faeb57629657cf6dd0d250db6f900aa4511f4673534702adea5d041629186ef91bc877dd697e53a62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsequencer-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
