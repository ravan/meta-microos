SUMMARY = "Fish Completion for werf"
DESCRIPTION = "Fish command line completion support for werf."
LICENSE = "Apache-2.0"

PV = "2.75.3"

RPM_NAME = "werf-fish-completion-2.75.3-1.1.noarch.rpm"
RPM_HASH = "05fc38ac834665d007410d27ed98717876ac3ce78c6732ce6ebcd2e68c7eb356aeaea9f1dae2089172d8374642c125488bfd281627a4d494ae265359462e57b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "werf-fish-completion"

RDEPENDS:${PN} += "werf"

inherit rpm
