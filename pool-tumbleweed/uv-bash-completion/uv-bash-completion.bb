SUMMARY = "Bash Completion for python-uv"
DESCRIPTION = "Bash command-line completion support for python-uv. \
 \
Provides: python2-uv = 0.12.13-1.1"
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "0.12.13"

RPM_NAME = "uv-bash-completion-0.12.13-1.1.noarch.rpm"
RPM_HASH = "065b7dde42d499d73b3238fd5f13fee6b326efb3139008bea57814e5efb50c8761bf9e3e684d471a5e0703a03b69b95ad7bfe39bf52dc52a987711258b580252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-uv-bash-completion \
uv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
uv"

inherit rpm
