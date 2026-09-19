SUMMARY = "Migration module for tik"
DESCRIPTION = "Migration module for tik. Detects existing btrfs /home subvolumes and offers to backup/restore it using the tik USB stick."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-module-mig-1.5.1-3.1.noarch.rpm"
RPM_HASH = "77e02144f0a5f0b6ceafc2acacb16147bebb32197ac78fc1e2abb4b6923a953c4fccf574669b07ef6acc488ef6b8efd0dcb1ba4a8e093853d96e47509914b6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tik-module-mig"

RDEPENDS:${PN} += "tik"

inherit rpm
