SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-demo-2.5.1-31.4.noarch.rpm"
RPM_HASH = "cb3a03b2dd2b294d895d37428c2a7ec930ab8731a298e627a027446af47cb64a1de9ef9388ad1efa3ac51a3fb25ace3ce65dc67d386cb41db05a909455b31d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jisp2-demo"

RDEPENDS:${PN} += ""

inherit rpm
