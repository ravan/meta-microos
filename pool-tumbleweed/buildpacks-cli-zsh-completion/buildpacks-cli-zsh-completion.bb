SUMMARY = "Zsh Completion for buildpacks-cli"
DESCRIPTION = "zsh command line completion support for buildpacks-cli."
LICENSE = "Apache-2.0"

PV = "0.40.9"

RPM_NAME = "buildpacks-cli-zsh-completion-0.40.9-1.1.noarch.rpm"
RPM_HASH = "d39b7cf7ef5f8a507f47cc38c5cea75609ddc1d74b935a49a66fb632f937c3c8b0cc1d3d7abb78ee4e33f41d9a4b2896e8c546f7d189ec1ba75867abf2b3913d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildpacks-cli-zsh-completion"

RDEPENDS:${PN} += "buildpacks-cli"

inherit rpm
