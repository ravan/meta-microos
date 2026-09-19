SUMMARY = "Fish Completion for kyverno"
DESCRIPTION = "Fish command line completion support for kyverno."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "kyverno-fish-completion-1.19.0-1.1.noarch.rpm"
RPM_HASH = "261837a087654693a0d15861e5ca5240e5eed271d80daa0b2f93173289c2d9170bb1d9d85972b5830723cedb8ca0529bbc4fe4257bee49dd28f37c9e0a237e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kyverno-fish-completion"

RDEPENDS:${PN} += "kyverno"

inherit rpm
