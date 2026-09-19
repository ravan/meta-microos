SUMMARY = "Bash completion for mbimcli"
DESCRIPTION = "This package contain de bash completion command for mbimcli tools."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.34.0"

RPM_NAME = "mbimcli-bash-completion-1.34.0-1.4.noarch.rpm"
RPM_HASH = "6953dddaa962865e431acdaa340818cc78918456c713f7dd44088e3d7887ca83dc0deecd66c4e0e252ee4fc6751183fbc9af5d53854934582c2d27bdea44aedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mbimcli-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
