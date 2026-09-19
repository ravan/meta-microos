SUMMARY = "Export server for kubevirt"
DESCRIPTION = "The virt-exportserver package provides an http server for kubevirt to \
serve the data of VirtualMachineExport resource in different formats"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-exportserver-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "1de72a76dfd4a50a857602caf32aec8ddb47fa9d68b32e1f9b39d091532e211e6a58fbba987fc40f1b2aa1a2acc056d1a415b973bfb5516e41106b328960e158"

RPROVIDES:${PN} += "kubevirt-1.8-virt-exportserver \
kubevirt-virt-exportserver \
kubevirt1.8-virt-exportserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
