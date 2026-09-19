SUMMARY = "Compile-time Dependency Injection for Go"
DESCRIPTION = "Wire is a code generation tool that automates connecting components using \
dependency injection. Dependencies between components are represented in Wire \
as function parameters, encouraging explicit initialization instead of global \
variables. Because Wire operates without runtime state or reflection, code \
written to be used with Wire is useful even for hand-written initialization."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "wire-0.7.0-1.6.aarch64.rpm"
RPM_HASH = "8087988dfabc2a28074553eca2ce1ce402bfa461cc3f95305f8c48a7736b5fe4079d68257c4bcf974a0833cab24c7da73bd13b025595fb635d0d49567fed0748"

RPROVIDES:${PN} += "wire"

RDEPENDS:${PN} += ""

inherit rpm
