SUMMARY = "Documentation for adcli"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain. \
 \
This package contains the documentation for adcli."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3.1"

RPM_NAME = "adcli-doc-0.9.3.1-2.7.noarch.rpm"
RPM_HASH = "25bb15fc8ae1793ce50ef273fd00160b7be5b4c8b1f14b34338a3f7111891552b286df60499cbf72e6ba1d7c34191fc00b565f66664dfb154ee498b66afece6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adcli-doc"

RDEPENDS:${PN} += ""

inherit rpm
