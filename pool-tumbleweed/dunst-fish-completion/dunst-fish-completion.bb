SUMMARY = "Fish Completion for dunst"
DESCRIPTION = "The official fish completion script for dunst, generated during the build."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "dunst-fish-completion-1.13.2-1.3.noarch.rpm"
RPM_HASH = "f15462f33684df24eab886c9b45ae304cbbcae97b77ad9da2db5df9af6e98795b1ca538c8a14f3b42e5987cb48ab2d500b3d69199912e5a0c3cff29fd7c3bc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dunst-fish-completion"

RDEPENDS:${PN} += "dunst"

inherit rpm
