SUMMARY = "Ruby bindings for libsuseconnect library"
DESCRIPTION = "This package provides bindings needed to use libsuseconnect from Ruby scripts."
LICENSE = "LGPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "suseconnect-ruby-bindings-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "1d753474430cc8dfb6038369258cd845c338ffbae8b1a2e79477f29224fc3fe25449593169179fdf14fe60c75f4e3b8f50a5c8bbb453eae2fbe26571ee706c7e"

RPROVIDES:${PN} += "suseconnect-ruby-bindings"

RDEPENDS:${PN} += "libsuseconnect"

inherit rpm
