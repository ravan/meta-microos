SUMMARY = "Handles source downloads defined in snapcraft.yaml files"
DESCRIPTION = "Experimental snapcraft support: This parses snapcraft.yaml files for SCM \
resources and packages them."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "obs-service-snapcraft-0.12.4-1.1.noarch.rpm"
RPM_HASH = "cbb6d0adc18fc671a4fb969c043c839e4e8d7a2f66abfb45f3a84b9c682f0de48db0ffeb9f3d92a95ef48fd5cc7313c923bc85adfa9fbaf138cca29137cce3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-snapcraft \
obs-service-tar-scm-/usr/lib/obs/service/snapcraft.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm
