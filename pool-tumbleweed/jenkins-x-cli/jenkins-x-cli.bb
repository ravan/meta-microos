SUMMARY = "CLI for Jenkins X"
DESCRIPTION = "Jenkins X provides automated CI+CD for Kubernetes with Preview Environments on \
Pull Requests using Cloud Native pipelines from Tekton. \
 \
This package contains the CLI called jx."
LICENSE = "Apache-2.0"

PV = "3.17.74"

RPM_NAME = "jenkins-x-cli-3.17.74-1.1.aarch64.rpm"
RPM_HASH = "005fc64c70dcd24f51a7f5171a7e517cf3665bc9153dfefbabe8b72487e477a41743fce57dbf911bbaea3d223d1d0c307b8d483ae97e6701a589aaf758defb38"

RPROVIDES:${PN} += "jenkins-x-cli \
jx"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
