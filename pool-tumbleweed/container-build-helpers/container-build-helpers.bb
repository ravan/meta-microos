SUMMARY = "Scripts to cleanup container images after a build"
DESCRIPTION = "This is a simple script that removes the unecessary bits and pieces left on a \
system after zypper has been run. This reduces the total size of the final \
container image."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1"

RPM_NAME = "container-build-helpers-0.0.1-2.6.noarch.rpm"
RPM_HASH = "406ddadb6d5fe4d86192157255d141282383b40aecdd35360da278aa16b19dcdb10400a621cb524555e7e532776c3a2a51d0ab41aa786ee85036c384782f0457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-helpers"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
