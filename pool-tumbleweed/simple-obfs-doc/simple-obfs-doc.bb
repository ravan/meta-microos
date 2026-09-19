SUMMARY = "Documents for simple-obfs"
DESCRIPTION = "Simple-obfs is a simple obfusacting tool, designed as plugin server of shadowsocks. \
 \
This package provides Documents for it."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "simple-obfs-doc-0.0.5-6.3.noarch.rpm"
RPM_HASH = "1144e65a984ff00cf32144c3509587cb136e171edd3ff92fabdbe1f8d573e082b2cee03f64617e21ec539cdfdd4a62374e7675074f75c62732d4d28986b14430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "simple-obfs-doc"

RDEPENDS:${PN} += "simple-obfs"

inherit rpm
