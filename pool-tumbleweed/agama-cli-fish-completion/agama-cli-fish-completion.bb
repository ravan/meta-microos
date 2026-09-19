SUMMARY = "Fish Completion for agama-cli"
DESCRIPTION = "Fish command-line completion support for agama-cli."
LICENSE = "GPL-2.0-or-later"

PV = "24+0.a836cced5"

RPM_NAME = "agama-cli-fish-completion-24+0.a836cced5-54.1.noarch.rpm"
RPM_HASH = "7493dea856e3f32f2dd71ddfe853a7c7f56b63d81e3ecb0b2097a62aef3d29c9676e939897979eef4009e4d1ef129984befa7d49aafb8c8af1dd3636ace70db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-cli-fish-completion"

RDEPENDS:${PN} += "agama-cli \
fish"

inherit rpm
