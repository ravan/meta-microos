SUMMARY = "Configuration of cluster"
DESCRIPTION = "-"
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-cluster-5.0.2-1.2.noarch.rpm"
RPM_HASH = "4642ed101527eba5638b3931c165b0c58da8966e1f6b9809f9476a692d1931b4725fd30d731a0b93aaedc3adac8f0223c0f1a9659f43c2ad32b03d51ccfb7d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-cluster"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
yast2 \
yast2-ruby-bindings"

inherit rpm
