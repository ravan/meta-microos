SUMMARY = "Bash Completion for velero"
DESCRIPTION = "Bash command line completion support for velero."
LICENSE = "Apache-2.0"

PV = "1.18.2"

RPM_NAME = "velero-bash-completion-1.18.2-1.3.noarch.rpm"
RPM_HASH = "d838ab210a1a10953384465ccd3329fd7a0f408e6b0258a43df7fb13722a4c8bffd2ac1b3d3b1c02cef6b50613f6c8e45629d23aa1ade935d02d681384c40e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "velero-bash-completion"

RDEPENDS:${PN} += "velero"

inherit rpm
