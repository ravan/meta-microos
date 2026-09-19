SUMMARY = "GUI date picker for Java using SWT"
DESCRIPTION = "SWTCalendar is a port of Kai Toedter's JCalendar to Eclipse's SWT. \
It is a GUI date picker for Java using SWT as the GUI toolkit. \
SWTCalendar was designed to be a flexible component so developer \
can embed a date picker in their application or create their own \
standalone date picker dialog."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "swtcalendar-0.5-4.6.noarch.rpm"
RPM_HASH = "f42bfc1441ce66b186ee7c06ef97b8d8c22a0519bc01aebb138b8abfd6158dc7ccc50e8efc12f263f8e674aa651d0aa72a5023ef08c4af8a095da633807eba08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swtcalendar"

RDEPENDS:${PN} += ""

inherit rpm
