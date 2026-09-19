SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for \
Kubernetes applications. You can iterate on your application source code \
locally then deploy to local or remote Kubernetes clusters. Skaffold handles \
the workflow for building, pushing and deploying your application. It also \
provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.24.0"

RPM_NAME = "skaffold-2.24.0-1.2.aarch64.rpm"
RPM_HASH = "1cb1caf4f43f7bdfcfbbd66dd1e4660730355dfe0e5e3b0ec2472e5bea35f345021c5dd2109ea7541bad47b3d87b5c245ec389d2fd9dd75d4218bc50083906b6"

RPROVIDES:${PN} += "skaffold"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
