SUMMARY = "Fish completion for gopass"
DESCRIPTION = "Manage your credentials with ease. In a globally distributed team, on multiple devices or fully offline on an air gapped machine. \
 \
Works everywhere - The same user experience on Linux, MacOS, *BSD or Windows \
Built for teams - Built from our experience working in distributed development teams \
Full autonomy - No network connectivity required, unless you want it \
 \
This package holds the shell completion for fish."
LICENSE = "MIT"

PV = "1.17.2"

RPM_NAME = "gopass-fish-completion-1.17.2-1.1.noarch.rpm"
RPM_HASH = "e7875d15badcababc390f7b456c781ddbc4c017219cf01f4f5fecca6375f7573268aa3cc1547bc14354da36cf8681cf2c628859bbd62b6aa0c8b8dbede7763ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gopass-completion-fish \
gopass-fish-completion"

RDEPENDS:${PN} += "gopass"

inherit rpm
