SUMMARY = "Framework for manipulating Bible texts"
DESCRIPTION = "The SWORD Project is an effort to create an ever expanding software package for \
research and study of God and His Word. \
 \
The SWORD Bible Framework allows easy manipulation of Bible texts, commentaries, \
lexicons, dictionaries, etc.  Many frontends are build using this framework. \
An installed module set may be shared between any frontend using the framework."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "1.9.0"

RPM_NAME = "sword-1.9.0-2.1.aarch64.rpm"
RPM_HASH = "ecf08f346564f6f15fa9449a37f5c9f27d6afde71266cc3b5d94f3b21e5392311d37b38070c05da1d4efa8fa51b98e900827fc4f344ae1401e7892668bd82186"

RPROVIDES:${PN} += "config-sword \
sword"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libstdc++.so.6 \
libsword-1.9.0.so"

inherit rpm
