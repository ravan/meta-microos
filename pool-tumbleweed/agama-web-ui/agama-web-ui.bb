SUMMARY = "Web UI for Agama installer"
DESCRIPTION = "Agama web UI for the experimental Agama installer."
LICENSE = "GPL-2.0-or-later"

PV = "24+0.a836cced5"

RPM_NAME = "agama-web-ui-24+0.a836cced5-52.1.noarch.rpm"
RPM_HASH = "3d3921f0777ac213ff8838798eddd6341d98ff026194b6faab98f3f584415d807a0ba098df7465c121705c3ca2ad45f870aa6bb116cca693e7dd8f29910b6a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-web-ui"

RDEPENDS:${PN} += ""

inherit rpm
