SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-exportproxy-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "2fe62ff6de8275e2f5f45203311fccafd50184b3acec7817a6a76bd06afeb12dfe8ebefee0dc36e9f898602e729fad116d29a459f92f202370b92b1e5b3d407f"

RPROVIDES:${PN} += "kubevirt-1.8-virt-exportproxy \
kubevirt-virt-exportproxy \
kubevirt1.8-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
