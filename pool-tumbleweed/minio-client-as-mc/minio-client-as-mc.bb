SUMMARY = "Actually have an /usr/bin/mc binary for minio-client"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for \
filesystems and object storage. \
 \
This package restores the /usr/bin/mc again"
LICENSE = "AGPL-3.0-only"

PV = "20250813T083541Z"

RPM_NAME = "minio-client-as-mc-20250813T083541Z-1.6.noarch.rpm"
RPM_HASH = "d9d9854a215630749339516c07d33927fc9635d1dfd2ea5be0605ddb5a7feac765e23e2f3ff9cf8de077f5f2588a56aca639cae512fb29584a0710293ce63d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minio-client-as-mc"

RDEPENDS:${PN} += "minio-client"

inherit rpm
