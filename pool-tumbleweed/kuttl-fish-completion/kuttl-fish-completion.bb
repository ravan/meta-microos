SUMMARY = "Fish Completion for kuttl"
DESCRIPTION = "Fish command line completion support for kuttl."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "kuttl-fish-completion-0.26.0-1.4.noarch.rpm"
RPM_HASH = "2a1f8d98121571b2f23298d5df487e295269026147fd47cd5cb293dca7b594095a9668bb8ca4c031761250e322d22ad85af2f696d5f630fd64cb12e33cf7c609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuttl-fish-completion"

RDEPENDS:${PN} += "kuttl"

inherit rpm
