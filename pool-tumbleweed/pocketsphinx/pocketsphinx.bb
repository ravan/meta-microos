SUMMARY = "Speech recognizer library written in C"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time."
LICENSE = "BSD-2-Clause"

PV = "5.0.3+git20241211.69167fb"

RPM_NAME = "pocketsphinx-5.0.3+git20241211.69167fb-1.7.aarch64.rpm"
RPM_HASH = "dcb7bb182ce9109f508e23cf7a8015f222abe9dbcb5324f9fea37eef734b613c40ceaae2308e486ff21f5801732b028bd88fac90c9378fa42dd649bb1f8ecc2f"

RPROVIDES:${PN} += "pocketsphinx \
pocketsphinx5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpocketsphinx.so.5"

inherit rpm
