SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-exportserver-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "9dabdb917ff1041078f42c2c343ac1dd8a166e9c688b3d2dbdc7688a72a9c9fd9db0dde3e491f25d549b6b3eadfa1c437370e309d3355217d6a4e1fc391b4943"

RPROVIDES:${PN} += "kubevirt-virt-exportserver \
kubevirt1.9-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
