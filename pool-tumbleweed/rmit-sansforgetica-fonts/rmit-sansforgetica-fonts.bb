SUMMARY = "Sans Forgetica Font"
DESCRIPTION = "Sans Forgetica is more difficult to read than most typefaces – and that's by design. \
The 'desirable difficulty' you experience whee reading information formatted in \
Sans Forgetica prompts your brain to engage in deeper processing. Sans Forgetica is \
designed for non-commercial use only. It is bound by a creative commons, non-commercial, \
attributed (CCBYNC) license."
LICENSE = "CC-BY-NC-4.0"

PV = "1.000"

RPM_NAME = "rmit-sansforgetica-fonts-1.000-1.18.noarch.rpm"
RPM_HASH = "26fb25de2888d6e5279feeceae3d8493676f4f7a1bb412855f577b410c806621d2f37a745d88948a69f52bff9a32d2f42b29ed466f431f012a6c03a18d957c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rmit-sansforgetica-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
