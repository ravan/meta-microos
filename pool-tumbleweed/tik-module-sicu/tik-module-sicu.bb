SUMMARY = "SelfInstall CleanUp module for tik"
DESCRIPTION = "SelfInstall CleanUp module for tik. Removes & reconfigures things in a SelfInstall-deployed system that cant otherwise be handled via systemd-repart."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-module-sicu-1.5.1-3.1.noarch.rpm"
RPM_HASH = "14a54b5050a02cb11982fcb234d72c1c9259f09c70d88d0c4f0b1a74517bb0891f6558a53dea32606e85ea94027f24bb722f63f6d8928857bb21610325cd7ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tik-module-sicu"

RDEPENDS:${PN} += "tik"

inherit rpm
