SUMMARY = "replacement find"
DESCRIPTION = "a script to enhance the reproducibility of the output of find"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-find-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "4880ce97dd91a048b58ee0270de86013075fbf930b2bf3ec50f20861d1de7988415f33014ccb50856816306849cf3d2624cf653ac4252a2e44049798e148c7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-find"

RDEPENDS:${PN} += "/usr/bin/bash \
reproducible-faketools"

inherit rpm
