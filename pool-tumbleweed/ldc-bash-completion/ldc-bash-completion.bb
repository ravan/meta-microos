SUMMARY = "LDC Bash completion"
DESCRIPTION = "Optional dependency offering bash completion for ldc2"
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "ldc-bash-completion-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "129aaeb546f75a77f896e16df0de37e1f583099ee392c2fa0d301a1ae5ef8221b864ad8483e67f7d4988a8edf2633a33cf90494d4ab0c705288602fd1941402a"

RPROVIDES:${PN} += "ldc-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ldc"

inherit rpm
