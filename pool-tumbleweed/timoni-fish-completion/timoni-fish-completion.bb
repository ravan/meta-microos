SUMMARY = "Fish Completion for timoni"
DESCRIPTION = "Fish command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "timoni-fish-completion-0.33.0-1.1.noarch.rpm"
RPM_HASH = "b4c15e3f81a51ecb73941ce0dd3c158bc1180d35e75205ce5934eaf2498649c471fdd258d351f9b7fcc8a638dc35a0caae7666d282ea8eb9e6d9c742bea1c3f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-fish-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
