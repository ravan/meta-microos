SUMMARY = "A toolkit for generation of output for the web"
DESCRIPTION = "Genshi is a Python library that provides an integrated set of \
components for parsing, generating, and processing HTML, XML or \
other textual content for output generation on the web. The major \
feature is a template language, which is heavily inspired by Kid."
LICENSE = "BSD-3-Clause"

PV = "0.7.11"

RPM_NAME = "python313-Genshi-0.7.11-2.2.aarch64.rpm"
RPM_HASH = "ccb2322ccbf0c576a09102483c0739854fe65a6805b1700084fdea5a0e05ef7fc640622b4d6f32f0b947f37190c3334c4f779ec4a9883d1ebdb0a985f795f139"

RPROVIDES:${PN} += "python3-Genshi \
python3.13dist-genshi \
python313-Genshi \
python3dist-genshi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-Babel \
python313-xml"

inherit rpm
