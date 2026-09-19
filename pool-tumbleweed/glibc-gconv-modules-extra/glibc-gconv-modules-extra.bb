SUMMARY = "Non-essential gconv modules"
DESCRIPTION = "Modules for use by the iconv facility, to support encodings other than \
Latin-1 and UTF based."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44"

RPM_NAME = "glibc-gconv-modules-extra-2.44-2.1.aarch64.rpm"
RPM_HASH = "36effbf3cb1bdd172a222c681029578124f2cc4ca6ef8c75f132bd2c41aefaa1f0a1dc967ee9b5319f6d0d3a60ac6de0118e186e2945fd8a1b49368340339715"

RPROVIDES:${PN} += "glibc-gconv-modules-extra \
glibc-locale-base-/usr/lib64/gconv/BIG5.so \
libCNS.so \
libGB.so \
libISOIR165.so \
libJIS.so \
libJISX0213.so \
libKSC.so"

RDEPENDS:${PN} += "/usr/sbin/iconvconfig \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
