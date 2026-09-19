SUMMARY = "Zsh Completion for python-uv"
DESCRIPTION = "Zsh command-line completion support for python-uv."
LICENSE = "(Apache-2.0 | MIT) & MPL-2.0"

PV = "0.12.13"

RPM_NAME = "uv-zsh-completion-0.12.13-1.1.noarch.rpm"
RPM_HASH = "e6cf6565153b35389f08281f18723e5c31c36b02bc375614f615a620a44925e99fbb604726088a1d30bfc2c5c2ed70be492ee54c3596e07f2338b55ba110c942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-uv-zsh-completion \
uv-zsh-completion"

RDEPENDS:${PN} += "uv \
zsh"

inherit rpm
