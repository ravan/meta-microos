SUMMARY = "Bash completion for libxkbcommon-tools"
DESCRIPTION = " \
Bash completion for libxkbcommon-tools."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbcommon-tools-bash-completion-1.13.2-1.3.noarch.rpm"
RPM_HASH = "366663e43cf8ac81646b6467212406b012775447a458766a7e982c23761edfbd790a1e66b0f64d097d3e147d1bf9bf9b8905bc61c22c29557adc65d7611ab356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxkbcommon-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
libxkbcommon-tools"

inherit rpm
