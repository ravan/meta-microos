SUMMARY = "Zsh Completion for roast"
DESCRIPTION = "Zsh command-line completion support for roast."
LICENSE = "MPL-2.0"

PV = "10.0.2"

RPM_NAME = "roast-zsh-completion-10.0.2-1.11.noarch.rpm"
RPM_HASH = "afd8c49313af5ab12618e3b84758a54f8c740a82bab42fdd431847049f768bdc357512649e4b8483987cd0157083c836e8d7a777242e4441341433e21246226c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "roast-zsh-completion"

RDEPENDS:${PN} += "roast \
zsh"

inherit rpm
