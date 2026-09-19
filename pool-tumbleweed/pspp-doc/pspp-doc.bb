SUMMARY = "Manual for PSPP"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "pspp-doc-2.1.1-2.2.noarch.rpm"
RPM_HASH = "a29f62a1bb06e1bfdbcbdebc64c979e8a3a0a67d35897722be43869a030f76a08b68652cf5a1a68a6bfea5eff22fab6bab0091ac83a575d0c74aeee6daee857c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pspp-doc"

RDEPENDS:${PN} += "pspp"

inherit rpm
