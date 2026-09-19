SUMMARY = "Bash completion for gopass"
DESCRIPTION = "Manage your credentials with ease. In a globally distributed team, on multiple devices or fully offline on an air gapped machine. \
 \
Works everywhere - The same user experience on Linux, MacOS, *BSD or Windows \
Built for teams - Built from our experience working in distributed development teams \
Full autonomy - No network connectivity required, unless you want it \
 \
This package holds the shell completion for bash."
LICENSE = "MIT"

PV = "1.17.2"

RPM_NAME = "gopass-bash-completion-1.17.2-1.1.noarch.rpm"
RPM_HASH = "addaac0ed8adc1c9da0f924d903611080b4a27cda8b9594cbb06d6b0f165534979da1bd4702b820a61d844b8ba669b38fefe1ac205f3396ce87d14bb39c35acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gopass-bash-completion \
gopass-completion-bash"

RDEPENDS:${PN} += "gopass"

inherit rpm
