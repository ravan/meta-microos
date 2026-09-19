SUMMARY = "Command line tool for managing Amazon S3 and CloudFront services"
DESCRIPTION = "S3cmd (`s3cmd`) is a free command line tool and client for uploading, retrieving \
and managing data in Amazon S3 and other cloud storage service providers that use \
the S3 protocol, such as Ceph, Google Cloud Storage or DreamHost DreamObjects. It is \
best suited for power users who are familiar with command line programs."
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "s3cmd-2.4.0-2.4.noarch.rpm"
RPM_HASH = "253d3106c7b4672ea7b6dea4a1146390f4ab0abae8fa3a338740537c8dfdd568741382cf50213520c2bf09920809fe53254c611c23f138e7bb1a6fd499e69fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-s3cmd \
python3dist-s3cmd \
s3cmd"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-magic \
python3-python-dateutil"

inherit rpm
