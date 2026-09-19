SUMMARY = "Fish Completion for tlp"
DESCRIPTION = "The official fish completion script for tlp."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.10.2"

RPM_NAME = "tlp-fish-completion-1.10.2-1.1.noarch.rpm"
RPM_HASH = "934c94eab2dc210969685cf422b355d0b9c3f8d6f194f1f0e2fd24f578bc56fb4935e4abbf10cc707a8c5a4a617b4c1a54256852806755541e23560b2ffbf4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-fish-completion"

RDEPENDS:${PN} += "tlp"

inherit rpm
