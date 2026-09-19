SUMMARY = "Python fork of perl SmartyPants"
DESCRIPTION = "smartypants is a Python implementation of the perl SmartyPants, \
which translates plain ASCII punctuation characters into smart \
typographic punctuation HTML entities."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python314-smartypants-2.0.2-2.5.noarch.rpm"
RPM_HASH = "57506ce6678ab4403db72a394152fc09331928945631295e76435de7abea303020d25c03dc4883d76ed361f0d31eac414323b000b3a48dd9f24f8fa3c142b051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-smartypants \
python314-smartypants \
python3dist-smartypants"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
