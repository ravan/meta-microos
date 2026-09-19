SUMMARY = "Zsh Completion for yq"
DESCRIPTION = "Zsh command line completion support for yq."
LICENSE = "MIT"

PV = "4.53.3"

RPM_NAME = "yq-zsh-completion-4.53.3-2.1.noarch.rpm"
RPM_HASH = "ff190ae0a1fd26e8d1957551817f71f6f89bf453a194f9c251f017fa9f760a42e492eda07030ab3f36ae44812ec050a5162c42783dc5d6f40714fbe58caf16f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-zsh-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
