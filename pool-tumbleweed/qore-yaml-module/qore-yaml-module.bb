SUMMARY = "YAML module for Qore"
DESCRIPTION = "This package contains the yaml module for the Qore Programming Language. \
 \
YAML is a flexible and concise human-readable data serialization format."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.0.0"

RPM_NAME = "qore-yaml-module-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "bc9f2d9ef119a4219490d941da4a1948943c47a05561eb0cd4a510e0521fce92f041b018212b6a3df71f816a3da750349aff1ae5b50a5ca35ccd3ee306c65e05"

RPROVIDES:${PN} += "qore-yaml-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyaml-0.so.2 \
qore-module-abi"

inherit rpm
