SUMMARY = "C++ library for identification of the language from tags"
DESCRIPTION = "liblangtag is an interface library to access tags for identifying \
languages. \
 \
Features: \
* several subtag registry database supports: \
  - language \
  - extlang \
  - script \
  - region \
  - variant \
  - extension \
  - grandfathered \
  - redundant \
* handling of the language tags \
  - parser \
  - matching \
  - canonicalizing"
LICENSE = "LGPL-3.0-or-later | MPL-2.0"

PV = "0.6.8"

RPM_NAME = "liblangtag1-0.6.8-1.3.aarch64.rpm"
RPM_HASH = "eb4b7346a499f46a91855f23868cb4708d98d2bb9582fc0d5f86b6edb344db990eb8b68700e8189ce1000bdabf030719069b5ba13025318084f087619aaec831"

RPROVIDES:${PN} += "liblangtag-ext-ldml-t.so \
liblangtag-ext-ldml-u.so \
liblangtag.so.1 \
liblangtag1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libxml2.so.16"

inherit rpm
