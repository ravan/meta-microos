SUMMARY = "Detects encoding of text files"
DESCRIPTION = "Enca is an Extremely Naive Charset Analyser. It detects character set and \
encoding of text files and can also convert them to other encodings using \
either a built-in converter or external libraries and tools like libiconv, \
librecode, or cstocs. \
 \
Currently, it has support for Belarussian, Bulgarian, Croatian, Czech, \
Estonian, Latvian, Lithuanian, Polish, Russian, Slovak, Slovene, Ukrainian, \
Chinese, and some multibyte encodings (mostly variants of Unicode) \
independent on the language. \
 \
This package also contains shared Enca library other programs can make use of. \
 \
Install Enca if you need to cope with text files of dubious origin \
and unknown encoding and convert them to some reasonable encoding."
LICENSE = "GPL-2.0-only"

PV = "1.19"

RPM_NAME = "enca-1.19-2.14.aarch64.rpm"
RPM_HASH = "95677013c1cb7fda4ec3520fe30c28691b3915ef0b4e0a5d8e9c72b0e16a307edf263d04c2278e0ea05f9af7ea778caf7ab9ad4f0ab25c0b8825a7c6826b648d"

RPROVIDES:${PN} += "enca"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenca.so.0 \
sed"

inherit rpm
