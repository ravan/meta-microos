SUMMARY = "Data files for the Thai language support library"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support. \
 \
This package contains the data files for libthai."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.30"

RPM_NAME = "libthai-data-0.1.30-1.4.aarch64.rpm"
RPM_HASH = "13ef59664ef313764d1befeccf7ba723964ce37fafbf183e1b9e7cfd3483ae22b23eb15e289ae68f562d5c8be59e124f697cc138b9f3db33e069a43d0d27bc4b"

RPROVIDES:${PN} += "libthai-data"

RDEPENDS:${PN} += ""

inherit rpm
