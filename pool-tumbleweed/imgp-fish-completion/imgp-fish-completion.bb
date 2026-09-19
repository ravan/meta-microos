SUMMARY = "Fish Completion for imgp"
DESCRIPTION = "Fish command line completion support for imgp."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "imgp-fish-completion-3.0-1.1.noarch.rpm"
RPM_HASH = "d7062229ac3fcf023aa81c56ead071e8e6d1ba54412fd902f8eecee2987c327556ec92894f39732c3414367274e972d5dee28a2ae9068d891c8ef660493064ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imgp-fish-completion"

RDEPENDS:${PN} += "imgp"

inherit rpm
