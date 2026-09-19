SUMMARY = "Makefiles shared by NetSurf projects"
DESCRIPTION = "netsurf-buildsystem contains makefiles shared by NetSurf projects."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "netsurf-buildsystem-1.10-1.9.noarch.rpm"
RPM_HASH = "11b19aff5adabb52290c8abf9fef13ecd1e3b7298a072a2973673f92212e86fc1750b330eff35e640522d0a233b673515f85cbbdf6dc35d8a811c97c027f5472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netsurf-buildsystem"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
