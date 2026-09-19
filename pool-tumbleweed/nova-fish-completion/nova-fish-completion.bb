SUMMARY = "Fish Completion for nova"
DESCRIPTION = "Fish command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "nova-fish-completion-3.12.0-1.4.noarch.rpm"
RPM_HASH = "64ba1123009dd8e88185486251ddc16a65c2e900e48dcb3f16469a62d658c5ec441ab22b5a24c6a4b42b9980082d7dc4c203c6c542605c4470b6caca67c739f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-fish-completion"

RDEPENDS:${PN} += "nova"

inherit rpm
