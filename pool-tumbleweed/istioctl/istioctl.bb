SUMMARY = "CLI for the istio servic mesh in Kubernetes"
DESCRIPTION = "The istioctl tool is a configuration command line utility that allows service \
operators to debug and diagnose their Istio service mesh deployments. The Istio \
project also includes two helpful scripts for istioctl that enable \
auto-completion for Bash and ZSH. Both of these scripts provide support for the \
currently available istioctl commands."
LICENSE = "Apache-2.0"

PV = "1.30.4"

RPM_NAME = "istioctl-1.30.4-1.1.aarch64.rpm"
RPM_HASH = "501e4247abbca1c6690893cb5ff95517a54624c21016d91d7291682683aba6383d9464502db4a8ef9d6bd22505acd3bd47dd5d1357a59fdf1874aa0ff62adfc8"

RPROVIDES:${PN} += "istioctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
