SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-javadoc-2.5.1-31.4.noarch.rpm"
RPM_HASH = "5e2c61ea57fddff65d6933b4d821783799a4013c9b24e13aa37c8e4be55d2455f5e2019c062f1344950802f373e70158d958896b3b6f6ef84a6ed80aa7d8b2e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
