SUMMARY = "Library for lexical processing and morphological analysis"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.3"

RPM_NAME = "liblttoolbox3-3.8.3-1.3.aarch64.rpm"
RPM_HASH = "3f9b169be9a7a2d25763abb8cfad815e6bf004208cdb3112a8841edce3317370bda50ae2d4033a92dfbe82e941cb1c0c3279e85ea4c3d382f597be360c88661c"

RPROVIDES:${PN} += "liblttoolbox.so.3 \
liblttoolbox3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuio.so.78 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
