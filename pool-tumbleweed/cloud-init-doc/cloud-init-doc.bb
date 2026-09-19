SUMMARY = "Cloud node initialization tool - Documentation"
DESCRIPTION = "Cloud-init is an init script that initializes a cloud node (VM) \
according to the fetched configuration data from the admin node. \
 \
Documentation and examples for cloud-init tools"
LICENSE = "GPL-3.0"

PV = "25.1.3"

RPM_NAME = "cloud-init-doc-25.1.3-6.1.aarch64.rpm"
RPM_HASH = "a2ae1eae3c3e064d72d01bc8b2f71e527e10d1a2517313d44734d7068d5c0e8dc391d17a75c60645fddec0bd2ef108d351c7bece85fa0c15600062e60491e234"

RPROVIDES:${PN} += "cloud-init-doc"

RDEPENDS:${PN} += ""

inherit rpm
