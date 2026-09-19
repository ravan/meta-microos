SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-zh_CN-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "d94c56325614ba733b85a066281bccc3ab9468707c9cf28b171400acb52bbde9644fe2c160e8d96cd43ba247e96b642fb14aa8c68f92b97ffe6fb3981e207ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
