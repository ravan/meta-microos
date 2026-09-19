SUMMARY = "One-script git synchronization"
DESCRIPTION = "This script synchronizes, almost automatically, 'tracking' repositories \
where a nice history is not as crucial as having one at all."
LICENSE = "CC0-1.0"

PV = "0.0.0~git20151024.eb9adaf"

RPM_NAME = "git-sync-0.0.0~git20151024.eb9adaf-3.7.noarch.rpm"
RPM_HASH = "f38cd63b1bd71cbdd2d3b38220f291de0c4225f5cd81114f733e1cc34ac0ba44d9909067b7e4810f956e3caed2e5a6b17e95cf407627ce8f712762f30cb1a56c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-sync"

RDEPENDS:${PN} += "/usr/bin/bash \
git-core"

inherit rpm
