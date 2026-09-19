SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE is a fast, versatile Kubernetes installer that you can use to install \
Kubernetes on your Linux hosts. \
Rancher Kubernetes Engine (RKE) is a CNCF-certified Kubernetes distribution \
that runs entirely within Docker containers. It works on bare-metal and \
virtualized servers. With RKE, the installation and operation of Kubernetes is \
both simplified and easily automated, and it’s entirely independent of the \
operating system and platform you’re running."
LICENSE = "Apache-2.0"

PV = "1.8.14"

RPM_NAME = "rke-1.8.14-1.4.aarch64.rpm"
RPM_HASH = "e2d0e9606e0c017081202af1f2fcb991ae800422ec4d60423a3e756fe426e79421087a5591792efcdf73a0309175d5492141972c2be95255578126b3a6568567"

RPROVIDES:${PN} += "rke"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
