SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoXML123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "2a9ab2bebcb056bd93ef1e48daf023bdc73099fd5ddaa0f7146989a0033c9c0455dbad6a99a200c560768314f70dd0eed579d91ac3f03fd85ddf6a712a8ab9c4"

RPROVIDES:${PN} += "libPocoXML.so.123 \
libPocoXML123 \
poco-xml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
