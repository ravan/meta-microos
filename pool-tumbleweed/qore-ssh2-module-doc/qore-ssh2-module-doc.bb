SUMMARY = "Documentation and examples for the Qore SSH2 module"
DESCRIPTION = "SSH2 module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.4.2"

RPM_NAME = "qore-ssh2-module-doc-1.4.2-4.5.noarch.rpm"
RPM_HASH = "ab678957b7d73617a720ba20a03a7f1e01f5730ffd80bcdf36726d5ffdebd3380b646b1b864eb0f041444cfa7aea5a41fe6f8920303dd8a0e6a194ac897ca8ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-ssh2-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
