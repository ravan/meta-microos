SUMMARY = "Tool to analyze and compare container images"
DESCRIPTION = "container-diff is a tool for analyzing and comparing container images. \
container-diff can examine images along several different criteria, including: \
- Docker Image History \
- Image file system \
- Apt packages \
- RPM packages \
- pip packages \
- npm packages \
 \
These analyses can be performed on a single image, or a diff can be performed \
on two images to compare."
LICENSE = "Apache-2.0"

PV = "0.19.0"

RPM_NAME = "container-diff-0.19.0-1.4.aarch64.rpm"
RPM_HASH = "077a0d161fd9ae87d008e44cdda682220224cf27a6b4484972c425b73efee4acbc307da52e17a713e3ee961183388700f233ab26a59cb78d13e1ce89a35e2d5b"

RPROVIDES:${PN} += "container-diff"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
