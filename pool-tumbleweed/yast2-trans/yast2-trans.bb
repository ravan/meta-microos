SUMMARY = "YaST2 - Translation Container Package"
DESCRIPTION = "This is a container package.  Its only purpose is to build the \
yast2-trans-LL, yast2-trans-LLL, and yast2-trans-LL_CC packages as \
subpackages."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "55165547934b9dc39b903d5e4dc2385f58a62e91bf7a7d4637f3b9858a517d8622780fd79b7428aa3f2ee9831d05e5b337880d350365c514524ef5d891ccba9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans"

RDEPENDS:${PN} += ""

inherit rpm
