SUMMARY = "Vim support for libvarlink"
DESCRIPTION = "Varlink is an interface description format and protocol for creating APIs."
LICENSE = "MIT"

PV = "24"

RPM_NAME = "varlink-vim-24-1.7.noarch.rpm"
RPM_HASH = "e85ff86b1ad12905fa7710734fd37cdd9507a2de37a16ba5341f4912dfcaeb7fabc386ffbda58de4ac7de3967d278a50e334ef33fc6ab9a2bf85018287ac9016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "varlink-vim"

RDEPENDS:${PN} += "vim"

inherit rpm
