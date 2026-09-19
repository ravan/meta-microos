SUMMARY = "Appstream processor employed by kiwi"
DESCRIPTION = "A wrapper around appstream-builder, called by kiwi in order to produce AppStream metadata \
for the repositories to be published"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "openSUSE-appstream-process-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "533a9d75d7fcc2ce4141cfc910635d8505c4ef40ce2fd22efb77e152d8fd7612401f18c0cec71394c8c389a4c61fe178a69fcc2e4a806fee720b51affe06c791"

RPROVIDES:${PN} += "openSUSE-appstream-process"

RDEPENDS:${PN} += "/usr/bin/bash \
appstream-glib \
glycin-loaders \
openSUSE-appdata-extra"

inherit rpm
