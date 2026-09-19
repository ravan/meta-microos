SUMMARY = "Fish completion for fwupd"
DESCRIPTION = "This package contain the fish completion command for the device firmware updater daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-fish-completion-2.1.7-2.1.noarch.rpm"
RPM_HASH = "cb35026b2df305ea345a89d31ec8941f4ce17b013762a633c45357187e600e046801ae6c4fca3db347f6ba2d6d8a66735e1a70d14f32dd0a7a0f76cb0d5e91d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fwupd-fish-completion"

RDEPENDS:${PN} += "fish \
fwupd"

inherit rpm
