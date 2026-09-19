SUMMARY = "A bootstrapping and management tool for k0s clusters"
DESCRIPTION = "k0sctl is a bootstrapping and management tool for k0s clusters."
LICENSE = "Apache-2.0"

PV = "0.32.2"

RPM_NAME = "k0sctl-0.32.2-1.1.aarch64.rpm"
RPM_HASH = "d4b0fbbae12effb343014450a3581ecd1f7d103adbe2128b227d5e8ff9e7dc12b69382f5e11a2da0d8516c3a3b0dd4c8ae5e5994731a44d19454e8b77f23b45e"

RPROVIDES:${PN} += "k0sctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
