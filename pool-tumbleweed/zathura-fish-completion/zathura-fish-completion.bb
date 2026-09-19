SUMMARY = "Zathura fish completion"
DESCRIPTION = "Optional dependency offering fish completion for zathura"
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "zathura-fish-completion-2026.07.18-1.1.noarch.rpm"
RPM_HASH = "48eb231082ce3a2d836cc4d050446dad9b48c7793e7fea63ea16372db8cf7e877d128d6a52044553c415502bc9b199033861b0819d56d414de509408f5a375b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zathura-fish-completion"

RDEPENDS:${PN} += "fish \
zathura"

inherit rpm
