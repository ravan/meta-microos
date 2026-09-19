SUMMARY = "The slightly more awesome standard unix password manager for teams"
DESCRIPTION = "Manage your credentials with ease. In a globally distributed team, on multiple devices or fully offline on an air gapped machine. \
 \
Works everywhere - The same user experience on Linux, MacOS, *BSD or Windows \
Built for teams - Built from our experience working in distributed development teams \
Full autonomy - No network connectivity required, unless you want it"
LICENSE = "MIT"

PV = "1.17.2"

RPM_NAME = "gopass-1.17.2-1.1.aarch64.rpm"
RPM_HASH = "84a2822d3f3557f1f79d1ae9c955365aa9ad8fdee9e2eda6822e7a85b24030452bb58f7f369879166299a8b06024024ea644c0dd636d60ecf4bc5d78f682a848"

RPROVIDES:${PN} += "config-gopass \
gopass"

RDEPENDS:${PN} += "git-core"

inherit rpm
