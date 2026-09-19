SUMMARY = "Widget to show git information"
DESCRIPTION = "Displays information about the git repository."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-git-2.1.5-4.7.noarch.rpm"
RPM_HASH = "0a853c018f37fb60abb8f274bd17173132b5963cee5c303e85182eae6a73e24ca4e248893882d87dcf3c4dba5a401a44b5033c45cd9b5291b22c4ba2a1539f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-git"

RDEPENDS:${PN} += "bumblebee-status \
python3-pygit2 \
xcwd"

inherit rpm
