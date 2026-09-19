SUMMARY = "Fish Completion for oc"
DESCRIPTION = "Fish command line completion support for oc."
LICENSE = "Apache-2.0"

PV = "4.22.0"

RPM_NAME = "oc-fish-completion-4.22.0-1.3.noarch.rpm"
RPM_HASH = "437613d68f9797a50a36bb4bbf7e4879403a1869ee7a406900f9cdd8483f291973da260c4405d18c7900c8bec2fc54e361484043b2a59e35e9cd207ec4fd9cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oc-fish-completion"

RDEPENDS:${PN} += "oc"

inherit rpm
