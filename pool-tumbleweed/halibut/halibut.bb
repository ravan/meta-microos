SUMMARY = "Document preparation system similar to TeX"
DESCRIPTION = "Halibut is a documentation production system, with elements similar to TeX, \
debiandoc-sgml, TeXinfo, and others. It is primarily targeted at people \
producing software manuals."
LICENSE = "MIT & APAFML"

PV = "1.3"

RPM_NAME = "halibut-1.3-1.4.aarch64.rpm"
RPM_HASH = "b77dab386234061be42717ec1c69f9b54abd85764127355cfb366185d1e97bc5570028f4abf40432762aeedc620e8573bfcfaf52b407e82ecc6f09ffd013b1f4"

RPROVIDES:${PN} += "halibut"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
