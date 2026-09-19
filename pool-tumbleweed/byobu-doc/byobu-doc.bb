SUMMARY = "Documentation files for byobu"
DESCRIPTION = "Help files and changelog for byobu."
LICENSE = "GPL-3.0-only"

PV = "6.15"

RPM_NAME = "byobu-doc-6.15-1.4.noarch.rpm"
RPM_HASH = "0b2d8517fcb7e8b5a7d18bf14e450be3dd3d1059f812c28558fabb91bedcafc176b6fa1b66684eb0fa75ae953105c10ec69218f2b3c87d1b8d7a571bf648750f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu-doc"

RDEPENDS:${PN} += "byobu"

inherit rpm
