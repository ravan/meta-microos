SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "1.14.7"

RPM_NAME = "coredns-extras-1.14.7-2.1.noarch.rpm"
RPM_HASH = "4cb99cfa4b377fe5ebc2d801e7954a6fc872f2ca085f40f3c0a547f4d94cb885820256e58eba07938bbb097d77eee4f1750ef831b4924997e3e8e10c23ce6f4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-extras \
coredns-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns"

inherit rpm
