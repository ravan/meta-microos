SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdcraw-qt6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7501d09ddae18cd1b5b95e39c10dde999b45246f458b1ada30d60a5b709184748ce550841a5176073dc6bf9e64f03009390dfa0ee5b90f37fe6c5f11c8c96035"

RPROVIDES:${PN} += "libkdcraw-qt6"

RDEPENDS:${PN} += ""

inherit rpm
