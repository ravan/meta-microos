SUMMARY = "Bash Completion for tealdeer"
DESCRIPTION = "Bash command-line completion support for tealdeer."
LICENSE = "Apache-2.0 | MIT"

PV = "1.8.0"

RPM_NAME = "tealdeer-bash-completion-1.8.0-1.7.noarch.rpm"
RPM_HASH = "d5f238cab77d621b1c4b38fd5608e9ae1a1da6fe0d03162500da7f93bed5d84ddf3306fa972e7ddc609374ad578c8e5f97ec1192270175632934163848609c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tealdeer-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tealdeer"

inherit rpm
