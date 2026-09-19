SUMMARY = "Fish Completion for frizbee"
DESCRIPTION = "Fish command line completion support for frizbee."
LICENSE = "Apache-2.0"

PV = "0.1.11"

RPM_NAME = "frizbee-fish-completion-0.1.11-1.1.noarch.rpm"
RPM_HASH = "a02af8b6af6fb5331a09bca02d274491f2c933c98cd5ec7ae51de556c4e3e2d64394db373470cf22edba423f3e7a5fd3614087c972555392bca9cb6474abf2f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frizbee-fish-completion"

RDEPENDS:${PN} += "frizbee"

inherit rpm
