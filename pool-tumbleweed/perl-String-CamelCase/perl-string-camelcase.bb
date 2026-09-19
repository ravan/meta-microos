SUMMARY = "Camelcase, de-Camelcase"
DESCRIPTION = "camelcase, de-camelcase"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-String-CamelCase-0.04-1.34.noarch.rpm"
RPM_HASH = "832f1108dc3bc4b23c6c60db7a93f71ebd0b6ececb76e288f61864452e3b245d192cd7c29ecaee944b2fc62400044e1550d8bfd34ac7d038ed26e25741daca49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--CamelCase \
perl-String-CamelCase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
