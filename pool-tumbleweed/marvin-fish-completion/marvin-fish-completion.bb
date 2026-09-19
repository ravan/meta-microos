SUMMARY = "Fish Completion for marvin"
DESCRIPTION = "Fish command line completion support for marvin."
LICENSE = "Apache-2.0"

PV = "0.2.13"

RPM_NAME = "marvin-fish-completion-0.2.13-1.1.noarch.rpm"
RPM_HASH = "c00ffee766f195356346bf866700fbfb26a74a12d87e57f81674c26208a219134a2d7e0c3dec444ed00efc18a2e3b42d5bb8f046a693a52f782a389e692d2619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "marvin-fish-completion"

RDEPENDS:${PN} += "marvin"

inherit rpm
