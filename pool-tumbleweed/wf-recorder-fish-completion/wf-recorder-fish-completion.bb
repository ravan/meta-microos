SUMMARY = "Fish Completion for wf-recorder"
DESCRIPTION = "Fish command line completion support for wf-recorder."
LICENSE = "MIT"

PV = "0.6.0+git4"

RPM_NAME = "wf-recorder-fish-completion-0.6.0+git4-1.5.noarch.rpm"
RPM_HASH = "c80a1987bfb320e9705822c855693118f3a45476be62d7063fc26eb64f10a20074bb46536cc0524aa0d85d559177436f584398967a0c5f9c367d145866ec1bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wf-recorder-fish-completion"

RDEPENDS:${PN} += "wf-recorder"

inherit rpm
