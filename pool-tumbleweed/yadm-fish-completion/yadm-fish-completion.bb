SUMMARY = "Fish Completion for yadm"
DESCRIPTION = "The official fish completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.3.0"

RPM_NAME = "yadm-fish-completion-3.3.0-1.6.noarch.rpm"
RPM_HASH = "8d9567c78719d7969eba4f72ae54209bcf329517a96957d9a4037f6fe99ab9df43d547d3db69c5d4680aac73692b2361ebeffd521661d2273357b7ffd9586327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
