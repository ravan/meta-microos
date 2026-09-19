SUMMARY = "Bash Completions for winetricks"
DESCRIPTION = "Bash Completions for winetricks."
LICENSE = "LGPL-2.1-or-later"

PV = "20260125"

RPM_NAME = "winetricks-bash-completion-20260125-1.5.noarch.rpm"
RPM_HASH = "4f5f9ca1086344822c13d94f4fb8946b10a09325b4103038d2ad7a36a5fde0415afe01567f16f1ed383a7942e8e2084da1d150ceabe0cfd7cfd8b2d4985c5a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "winetricks-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
