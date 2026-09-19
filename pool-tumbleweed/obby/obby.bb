SUMMARY = "Synced document buffers"
DESCRIPTION = "obby is a library which provides synced document buffers. It supports \
multiple documents in one session and is portable to both Windows and \
Unix-like platforms. \
 \
 \
 \
Authors: \
-------- \
    Armin Burgmeier <armin@0x539.de> \
    Philipp Kern <phil@0x539.de>"
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-0.4.8-11.39.aarch64.rpm"
RPM_HASH = "12fa0377dd04dd33f8750ad01feb8742b504e14059c36d45673a16c4ebeaf3fe04b580f58c84714e191174d57f3ecc4018e6982811feadf48b61500df48ab250"

RPROVIDES:${PN} += "obby"

RDEPENDS:${PN} += "libobby-0-4-1 \
obby-lang"

inherit rpm
