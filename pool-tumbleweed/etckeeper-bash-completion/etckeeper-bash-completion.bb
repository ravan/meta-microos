SUMMARY = "The bash completion for etckeeper"
DESCRIPTION = "Bash command line completion support for etckeeper."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.22"

RPM_NAME = "etckeeper-bash-completion-1.18.22-1.4.noarch.rpm"
RPM_HASH = "f50526237d1306a963761c3d806c2c0e29f80f686a5ea7a47eede5fa17d75da320939f93e7451e8bbbf645bd67defe52b1c89b2d8ab2c01e4534a3a306b65c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-bash-completion"

RDEPENDS:${PN} += "bash-completion \
etckeeper"

inherit rpm
