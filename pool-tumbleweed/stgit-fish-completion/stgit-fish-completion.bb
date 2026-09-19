SUMMARY = "Fish Completion for stgit"
DESCRIPTION = "Fish command line completion support for stgit."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "stgit-fish-completion-2.6.1-3.3.noarch.rpm"
RPM_HASH = "f2e9a6236b33d5f73cd2b326dbe586f8db4bb4beecd0530b33ec3ba4e25e3b060a89e875e8799d6d111a4c7b0962e5031a868a185e3554dba9fa7b9df93cb7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stgit-fish-completion"

RDEPENDS:${PN} += "fish \
stgit"

inherit rpm
