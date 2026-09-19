SUMMARY = "LeechCraft History Module"
DESCRIPTION = "This package provides a history keeper plugin for LeechCraft \
which stores information about finished downloads and similar events, \
and allows to search it by text, wildcard, regular expressions or tags."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-historyholder-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "878d8566a2f049619855aaf49cd26d6c7260185081ff2c87f252ea94d6e7be42b82afb24b94c4cb9181d6574486fe01059fe40d89411795add00990be0437e86"

RPROVIDES:${PN} += "leechcraft-historyholder \
libleechcraft-historyholder.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
