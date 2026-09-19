SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python313-smartypants-2.0.2-2.5.noarch.rpm"
RPM_HASH = "a432ed40edbacc73a3dcc03f09ff4fc68b61a9ecdbc1e7e2ff759b40f4d4395955bbc08e821c1eca96e4d5b0a212d232b2a88f77a66ff730e32ba4afb3114866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smartypants \
python3.13dist-smartypants \
python313-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
