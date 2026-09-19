SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for \
filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as \
`minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20250813T083541Z"

RPM_NAME = "minio-client-20250813T083541Z-1.6.aarch64.rpm"
RPM_HASH = "d11005f053645372626a76af541be35448ca0f28ce44a4331adfc05b008c3b6313d78bebf8b86c9727154d0384ef55ffb209e5bcdaf0ad52a0c58a1ef0f5785f"

RPROVIDES:${PN} += "minio-client \
minio-mc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
