SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmu_indic_lang1-2.2-1.13.aarch64.rpm"
RPM_HASH = "27bbbe524fe387b0ee9a4f9a180beb99d278d29e423c6e74b5b675cf661d7497215f858ace4e4737a5cc381524043627fae8fb69407a11ff87b7ae9a897e9086"

RPROVIDES:${PN} += "libflite-cmu-indic-lang.so.1 \
libflite-cmu-indic-lang1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libflite-usenglish.so.1 \
libflite.so.1"

inherit rpm
