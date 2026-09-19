SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-client-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "404808cb1fcb55fb3d680e16f660326ba205885fae3083d4506225461007e6d48cb3613761f24275a51ce1b9f9c6f7f24a86265a0bbceff8d01bb5eb13e24760"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.37-client"

RDEPENDS:${PN} += "kubernetes1.37-client-common \
update-alternatives"

inherit rpm
