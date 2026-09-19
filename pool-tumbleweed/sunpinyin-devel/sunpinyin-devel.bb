SUMMARY = "Development Files for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides development headers for it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-devel-2.0.99.2-3.6.aarch64.rpm"
RPM_HASH = "b86b1cea852c30b8154c0f6022954d46309611782a6e8e552bb6d4b2c77ca112153b041853488ce41cd59a3f7cf44efd6b90960c30818a7a3cee06275aac78a0"

RPROVIDES:${PN} += "libsunpinyin-devel \
pkgconfig-sunpinyin-2.0 \
sunpinyin-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsunpinyin3 \
pkgconfig-sqlite3 \
sunpinyin-tools"

inherit rpm
