SUMMARY = "Fish Completion for copacetic"
DESCRIPTION = "Fish command line completion support for copacetic."
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "copacetic-fish-completion-0.14.2-1.2.noarch.rpm"
RPM_HASH = "8c8f66a0d16927bf110f08a01909c8ce98257ba4ad430d2f6c49c29530792fa011be3e30fbf72bf174fe8a609ae5ca8151a84bd9cf04ad9138b8ca9d41fa91a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "copacetic-fish-completion"

RDEPENDS:${PN} += "copacetic"

inherit rpm
