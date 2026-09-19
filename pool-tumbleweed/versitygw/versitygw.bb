SUMMARY = "High-Performance S3 Translation Service"
DESCRIPTION = "The Versity S3 Gateway: a High-Performance S3 Translation Service \
 \
Use Cases \
- Turn your local filesystem into an S3 server with a single command! \
- Proxy S3 requests to S3 storage \
- Simple to deploy S3 server with a single command \
- Protocol compatibility in posix allows common access to files via posix or S3 \
- Simplified interface for adding new storage system support"
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "versitygw-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "ab6771a46fb599fd7dbce23f32c28f7c475899fc791e7442e03a32614605246fa02893ef6bd5109cda5a2a03dc647649721ce06d933c464f750a2edf08a8a631"

RPROVIDES:${PN} += "group-versitygw \
user-versitygw \
versitygw"

RDEPENDS:${PN} += "/usr/bin/sh \
versitygw-cli"

inherit rpm
