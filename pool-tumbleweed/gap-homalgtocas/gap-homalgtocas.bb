SUMMARY = "GAP: Abstraction layer for Homalg to access external CAS"
DESCRIPTION = "HomalgToCAS provides a layer for abstraction for further GAP modules \
to access an external CAS program (computer algebra system)."
LICENSE = "GPL-2.0-only"

PV = "2026.04.01"

RPM_NAME = "gap-homalgtocas-2026.04.01-1.2.noarch.rpm"
RPM_HASH = "c81b01b3407d2f731f6239db9c4150bf9bdbe66341ecc044b48395ad20cbda7be3798cf3f9b7d999a04da899a5111ce2815153b15044213b63eca8ce4cdf3870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-homalgtocas"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-matricesforhomalg \
gap-toolsforhomalg"

inherit rpm
