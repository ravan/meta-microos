SUMMARY = "Fish Completion for okteto"
DESCRIPTION = "Fish command line completion support for okteto."
LICENSE = "Apache-2.0"

PV = "3.22.0"

RPM_NAME = "okteto-fish-completion-3.22.0-1.1.noarch.rpm"
RPM_HASH = "a85abb4c7b67860b88304f12e959b39b031bc567f4c0b783340784ae72cbd80edb7895c37ea4b9855447ac97523941a4b87618a95a5e20494a2f4f9be14358cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteto-fish-completion"

RDEPENDS:${PN} += "okteto"

inherit rpm
