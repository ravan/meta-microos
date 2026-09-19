SUMMARY = "Development files for for MIME tree parser"
DESCRIPTION = "mimetreeparser is a parser for MIME trees. Given a MIME tree, it extracts \
the parts (text, html...) and attachments. This package provides \
files to develop applications using this library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "mimetreeparser-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8247e291f058b611bd66f72c0ca398a6fae0be1a5980e6c4ddd876febb20d35493dde9596f015167499f56afcafba6044f8d034e21955197f023d1ad468a0a55"

RPROVIDES:${PN} += "cmake-KPim6MimeTreeParserCore \
cmake-KPim6MimeTreeParserWidgets \
mimetreeparser-devel"

RDEPENDS:${PN} += "cmake-KF6I18n \
cmake-KF6Mime \
cmake-KPim6Mbox \
libKPim6MimeTreeParserCore6 \
libKPim6MimeTreeParserWidgets6"

inherit rpm
