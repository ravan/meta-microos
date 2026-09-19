SUMMARY = "Auto provides for system users"
DESCRIPTION = "Generate auto provides for system users."
LICENSE = "MIT"

PV = "3.3"

RPM_NAME = "sysuser-tools-3.3-12.3.noarch.rpm"
RPM_HASH = "ed1e481470a38814a88a081ed12f5e9a04d241a9199ea3d36c73ab6c26191f3251f53af3230c54f313ee6e3e078f25af6b6f28058baa9c4355c1c37986479dae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-sysusers-generate-pre \
rpm-macro-sysusers-requires \
sysuser-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
sysuser-shadow"

inherit rpm
