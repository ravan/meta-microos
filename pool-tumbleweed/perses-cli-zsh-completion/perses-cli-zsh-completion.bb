SUMMARY = "Zsh Completion for perses-cli"
DESCRIPTION = "zsh command line completion support for perses-cli."
LICENSE = "Apache-2.0"

PV = "0.54.0"

RPM_NAME = "perses-cli-zsh-completion-0.54.0-1.1.noarch.rpm"
RPM_HASH = "e016745c920990959a4ebb4856ffdcdb67c503b5802bbe7ef71e8336b3de51756b5fffb021fb751ac053adf0d293d48467daa99a3a2d212d6e1ad4c201c57b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perses-cli-zsh-completion"

RDEPENDS:${PN} += "perses-cli"

inherit rpm
