SUMMARY = "Bash completions scripts for jp2a"
DESCRIPTION = "This package contains the bash completions scripts for jp2a."
LICENSE = "GPL-2.0-only"

PV = "1.3.3"

RPM_NAME = "jp2a-bash-completion-1.3.3-1.6.noarch.rpm"
RPM_HASH = "4daf842814205861c6c13f894a30b280d3124f4f1c584f82e292a43bb5106b46b85f0c113f4d049360744df41f31dc9a238f0558285aa3e44109199acd42a318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jp2a-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
