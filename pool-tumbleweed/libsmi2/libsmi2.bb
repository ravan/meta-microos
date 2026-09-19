SUMMARY = "Libsmi Shared Libraries"
DESCRIPTION = "The purpose of libsmi is to \
 \
* Give network management applications a concise programmer-friendly \
   interface to access MIB module information \
 \
* Separate the knowledge on SMI from the main parts of management \
   applications \
 \
* Allow addition of new kinds of MIB repositories without the need to \
adapt applications that make use of libsmi"
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi2-0.4.8-29.6.aarch64.rpm"
RPM_HASH = "e724fd4d878327d5ef2a49e1c3f529d7d99b9afd43f4f6d894b2ff6b9457a436d741d6e6b915d5f4c83baef42208e4e57b15011431efae7373c761b0ee7acc1e"

RPROVIDES:${PN} += "libsmi.so.2 \
libsmi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi"

inherit rpm
