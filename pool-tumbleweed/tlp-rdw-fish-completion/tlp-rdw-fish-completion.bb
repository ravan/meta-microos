SUMMARY = "Fish Completion for tlp-rdw"
DESCRIPTION = "The official fish completion script for tlp-rdw."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-rdw-fish-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "fc9a425963599e21371fe6e8a12d2156c119b454606158152291bb9ce679a28fd443dfaeaab81b4262fd3686e4b32efcd22f8b438e73b762c00668a85511641e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-rdw-fish-completion"

RDEPENDS:${PN} += "tlp-rdw"

inherit rpm
