SUMMARY = "ZSH Completion for mpv"
DESCRIPTION = "ZSH command line completion support for mpv."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.0+git20260309.07c3ff3725"

RPM_NAME = "mpv-zsh-completion-0.41.0+git20260309.07c3ff3725-2.2.noarch.rpm"
RPM_HASH = "c7149d1734bdfccba6a2b9898cfec9a4b31f0f79a4c86933773c0375938047f320e12854348335c99a692715cc4c06fc32566a82864924e5ba79b30600a18552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpv-zsh-completion"

RDEPENDS:${PN} += "mpv"

inherit rpm
