SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ku-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "54bc9b019740fe1ae37e2a89765cc8c488ace2d75ccad2476258fd8ea29692bd9fe58c48f38f96c7c2f7faacb3a51f8a5780dcba67b466073edba76460a63307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
