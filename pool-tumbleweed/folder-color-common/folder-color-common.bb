SUMMARY = "Auxiliary files for the folder-color file browser extension"
DESCRIPTION = "A file browser extension for choosing the color of a folder."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.88"

RPM_NAME = "folder-color-common-0.0.88-3.4.noarch.rpm"
RPM_HASH = "bbc9098fb677cd50a0bab38c6bdc6c20f0377c59de8b26624f40bc3228a089ff372030c8c20b69fdf3a89cb3ece6f349f74f62742a8ea97fdd78517b80c237fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "folder-color-common \
python3.13dist-folder-color-common \
python3dist-folder-color-common"

RDEPENDS:${PN} += "gtk3-tools \
gvfs"

inherit rpm
