SUMMARY = "Python framework for efficient cluster administration"
DESCRIPTION = "ClusterShell is a set of tools and a Python library to execute commands \
on cluster nodes in parallel depending on selected engine and worker \
mechanisms. Advanced node sets and node groups handling methods are provided \
to ease and improve the daily administration of large compute clusters or \
server farms. Command line utilities like clush, clubak and nodeset (or \
cluset) allow traditional shell scripts to take benefit of the features \
offered by the library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.1"

RPM_NAME = "clustershell-1.10.1-1.1.noarch.rpm"
RPM_HASH = "69f21e66880a7865efd3102ecfab75755656c95dc0351185b52d8ffd030564dd59e4b8a42b04459f6e03527d359ae548dd7d1bbaeb00121b8b4cccc21a6be527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clustershell \
config-clustershell \
vim-clustershell"

RDEPENDS:${PN} += "python3-clustershell \
vim"

inherit rpm
