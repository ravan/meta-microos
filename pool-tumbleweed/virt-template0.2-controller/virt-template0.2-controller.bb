SUMMARY = "Controller for KubeVirt virtual machine templates"
DESCRIPTION = "The controller that reconciles VirtualMachineTemplate resources and their \
validating webhooks."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "virt-template0.2-controller-0.2.2-1.1.aarch64.rpm"
RPM_HASH = "d60ea2d555a7567def2f511fc68b5164068352bf5e003a74931c236cbb186dfe7df0332502816c8d56c9e55191ae18911977320eb3eec2d4b86788e0a2dff086"

RPROVIDES:${PN} += "virt-template-controller \
virt-template0.2-controller"

RDEPENDS:${PN} += ""

inherit rpm
