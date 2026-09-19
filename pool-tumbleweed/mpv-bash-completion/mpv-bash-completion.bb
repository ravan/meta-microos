SUMMARY = "Bash Completion for mpv"
DESCRIPTION = "Bash command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.0+git20260309.07c3ff3725"

RPM_NAME = "mpv-bash-completion-0.41.0+git20260309.07c3ff3725-2.2.noarch.rpm"
RPM_HASH = "cb790c6cd5ab1a1478b40c6d547e2d89884e313a5816a02e91c1e82b441a0a6f417f5f628aa53f7dd175ca078ae61deb5f496bb1a3f795b6f3f1abd613c58704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
mpv"

inherit rpm
