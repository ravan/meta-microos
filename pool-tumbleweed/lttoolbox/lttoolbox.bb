SUMMARY = "Toolbox for lexical processing and morphological analysis"
DESCRIPTION = "lttoolbox is a toolbox for lexical processing, morphological analysis \
and generation of words. Analysis is the process of splitting a word \
(e.g. cats) into its lemma 'cat' and the grammatical information \
<neutrum,plural>. Generation is the opposite process. \
 \
The package provides three programs, lt-comp, the compiler, \
lt-proc, the processor, and lt-expand, which generates all possible \
mappings between surface forms and lexical forms in the dictionary."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.3"

RPM_NAME = "lttoolbox-3.8.3-1.3.aarch64.rpm"
RPM_HASH = "b5fe2f103436b8b7d7e1e043cdb2c31783ba5cbd691893021f8a141fa0f04a4c188f185b3912b112fe2e49cce1ab6d9e761b8a5c4ed2b6a2f7f18bccecd46558"

RPROVIDES:${PN} += "lttoolbox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuio.so.78 \
liblttoolbox.so.3 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
