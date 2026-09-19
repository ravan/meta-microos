SUMMARY = "Export proxy for kubevirt"
DESCRIPTION = "The virt-exportproxy package provides a proxy for kubevirt to pass \
requests to virt-exportserver"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-exportproxy-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "ec04e1c3839266edb79f5b3d742db4c34800238fc5a1920d67b5658d73ab2b5215904c1aa5c69ac43f0a2a8ebb3b55c36916a701be9d44b3026e1cd53b3a5d8a"

RPROVIDES:${PN} += "kubevirt-virt-exportproxy \
kubevirt1.9-virt-exportproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
