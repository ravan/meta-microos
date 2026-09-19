SUMMARY = "Cockpit component for File Manager"
DESCRIPTION = "File manager as a cockipit component"
LICENSE = "LGPL-2.1-or-later"

PV = "43"

RPM_NAME = "cockpit-files-43-1.1.noarch.rpm"
RPM_HASH = "99f0e199472da8e2e682a3c1c2ab6bf0b8b2657424e7d463b1f51e4f80f80112a70590cdafdd5078bf79b59110a713c02585ec37c29e8140dce003fc4b78f13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-files"

RDEPENDS:${PN} += ""

inherit rpm
