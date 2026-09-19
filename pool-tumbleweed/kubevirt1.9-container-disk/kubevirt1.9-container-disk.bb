SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-container-disk-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "2c306e977b106c0e97ac10f378888820c73204631fcd96e78bb4171639ee3a51673ed08045565af2b638f6f51caf2522c9f58d54085e9ffbd5525e5832f96e0e"

RPROVIDES:${PN} += "kubevirt-container-disk \
kubevirt1.9-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
