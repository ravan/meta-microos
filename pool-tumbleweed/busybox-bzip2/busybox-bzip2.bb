SUMMARY = "Busybox applets replacing bzip2"
DESCRIPTION = "This package contains the symlinks to replace bzip2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-bzip2-1.38.0-42.2.noarch.rpm"
RPM_HASH = "9e402cb0519ae0d4af3d344bb469f56b7e5d831ea3be3c439b230e52f45a0fcd41004417005476f1e7176ff379b72e63c8110651e6768c8c86eb086d26b766c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bzip2"

RDEPENDS:${PN} += "busybox"

inherit rpm
