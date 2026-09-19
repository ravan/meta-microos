SUMMARY = "Bash completion for gmic"
DESCRIPTION = "This package contains the bash completion command for gmic."
LICENSE = "CECILL-2.1"

PV = "4.0.3"

RPM_NAME = "gmic-bash-completion-4.0.3-1.2.noarch.rpm"
RPM_HASH = "9fa25bff2bc653559fc65932622dcd226263c33c2981cf5483b5cf65e04fe915808b6e15fe07b510e23e59b7a624fc20146c62d423d952664661591145132271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmic-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
