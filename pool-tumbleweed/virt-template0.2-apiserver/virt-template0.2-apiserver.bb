SUMMARY = "Aggregated API server for KubeVirt virtual machine templates"
DESCRIPTION = "The aggregated API server that serves the template.kubevirt.io API group \
and processes VirtualMachineTemplate resources into virtual machines."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "virt-template0.2-apiserver-0.2.2-1.1.aarch64.rpm"
RPM_HASH = "bd35304952b02c0344e91f9222a19034d9e73c98b162b1a4c25210eb57b06e63c1c9363d922d1a175325d1c3ba742cf2f81d5eebcadbfd567b83b0bb1050d508"

RPROVIDES:${PN} += "virt-template-apiserver \
virt-template0.2-apiserver"

RDEPENDS:${PN} += ""

inherit rpm
