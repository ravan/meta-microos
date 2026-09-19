SUMMARY = "CLI tool to find exposed secrets in source and archives"
DESCRIPTION = "TruffleHog is a scanning engine that helps find exposed secrets \
within e.g. GitHub/GitLab repos, AWS S3 buckets, GCS buckets, \
Docker images, Circle CI/Travis CI setups, or in individual files."
LICENSE = "AGPL-3.0-or-later & MPL-2.0 & LGPL-3.0-or-later"

PV = "3.97.1"

RPM_NAME = "trufflehog-3.97.1-1.1.aarch64.rpm"
RPM_HASH = "4cac88671cbba76901a2d485425604731eb56da30bc7cbe5f8d339d867c645a3c85c7363d345019a65de836edd4bb4b43ac45a025fde56fad0fbaeadc007eb25"

RPROVIDES:${PN} += "trufflehog"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
