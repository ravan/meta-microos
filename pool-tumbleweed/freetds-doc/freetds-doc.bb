SUMMARY = "User documentation for FreeTDS"
DESCRIPTION = "The freetds-doc package contains the useguide and reference of FreeTDS \
and can be installed even if FreeTDS main package is not installed"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "freetds-doc-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "9645ac5a720d1b1a78112e0d13853fede723c2cb0d4df16ee3659b71685c2f332b84ba3bc8877127230cb9c7d81ad5d5e6ae457a76dab8ea44e8cbe5508b4562"

RPROVIDES:${PN} += "freetds-doc"

RDEPENDS:${PN} += ""

inherit rpm
