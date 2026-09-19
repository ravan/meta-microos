SUMMARY = "Audio tag information for Nemo file manager"
DESCRIPTION = "View audio tag information from the file manager's properties tab."
LICENSE = "GPL-3.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-audio-tab-6.4.0-6.4.noarch.rpm"
RPM_HASH = "519c8bc914a34fb526055689d8b74036c53e2ee8264ce297b42e72ae09d2fbe3bb06cb86d02c98826ffe515d7cf18f09a87d9bbddaed54ee37740f5c9d8b5a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-audio-tab \
python3.13dist-nemo-audio-tab \
python3dist-nemo-audio-tab"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
python3-mutagen \
python3-nemo \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Nemo"

inherit rpm
