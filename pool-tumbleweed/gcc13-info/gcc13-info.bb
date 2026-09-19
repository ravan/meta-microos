SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.5.0+git10516"

RPM_NAME = "gcc13-info-13.5.0+git10516-1.1.noarch.rpm"
RPM_HASH = "4b54bb10cd61c2735fe6e4a4ba78ac0390062f44a7d0aaf701232f957cb813f9cf8aa7d439f4a946c18c6c1eb0bb188180fc33db4dbce8dd6d0256701a7125ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
