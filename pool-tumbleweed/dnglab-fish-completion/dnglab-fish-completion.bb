SUMMARY = "This package provides tab completion for dnglab on the fish shell"
DESCRIPTION = "dnglab provides a command line tool to convert camera RAW files to Digital \
Negative Format (DNG). \
 \
This package provides tab completion for dnglab on the fish shell."
LICENSE = "LGPL-2.1-only"

PV = "0.8.0"

RPM_NAME = "dnglab-fish-completion-0.8.0-1.1.noarch.rpm"
RPM_HASH = "eacecd089ee2b5155cb384f3de2820481711196969ad549b1115892ed8990382a769da73e6467813e85c0fb9daa31d71fc2b0b75390d1b566b38932aea9031da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnglab-fish-completion"

RDEPENDS:${PN} += "dnglab \
fish"

inherit rpm
