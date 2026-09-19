SUMMARY = "Fish completion for lastpass-cli"
DESCRIPTION = "The fish completion script for the lpass command."
LICENSE = "GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "lastpass-cli-fish-completion-1.6.1-1.1.noarch.rpm"
RPM_HASH = "498cdadac291ca44f8003ecd4d52e674b3b230a37f4075635df1a1567a8d1eb905f423722462b5fb6f6f43977ef561d34d21964651282b036e7e1ccbb670859b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lastpass-cli-fish-completion"

RDEPENDS:${PN} += "lastpass-cli"

inherit rpm
