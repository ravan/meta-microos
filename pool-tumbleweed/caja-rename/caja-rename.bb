SUMMARY = "Batch renaming extension for Caja"
DESCRIPTION = "An extension for the Caja file browser allowing users to rename \
multiple files/folders in a single pass. \
 \
The application can change the case, insert, replace and delete \
strings, as well as enumerate the selection. Any changes are \
instantly visible in the preview list. The user interface strives \
to be as simple as possible, without confusing advanced \
operations."
LICENSE = "GPL-3.0-or-later"

PV = "24.5.1"

RPM_NAME = "caja-rename-24.5.1-1.11.aarch64.rpm"
RPM_HASH = "701ee0d55cdc2f9c4fbe4501bde9f713aca5823762a4109af99224fea7c7a161a8ae02cdf6377bf8e1e348587e73bf81a6703ee5736b609a223983cdca811d81"

RPROVIDES:${PN} += "caja-rename"

RDEPENDS:${PN} += "caja"

inherit rpm
