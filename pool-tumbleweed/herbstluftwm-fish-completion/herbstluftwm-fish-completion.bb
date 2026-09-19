SUMMARY = "Fish completion for herbstluftwm"
DESCRIPTION = "Fish completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "herbstluftwm-fish-completion-0.9.6-1.3.noarch.rpm"
RPM_HASH = "61b0b2afb0aabcf7b8b3e4779a7c731e6d09dd86dc449476f2f19f4e6c986a06060b2f025f0e2f60a04ee219019a64a25637506f750ba165421f7e4dca4349d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-fish-completion"

RDEPENDS:${PN} += "herbstluftwm"

inherit rpm
