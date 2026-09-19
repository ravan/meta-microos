SUMMARY = "Convert gettext PO files to JSON"
DESCRIPTION = "Convert gettext PO files to JSON objects so that you can use it in your \
application."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "ruby4.0-rubygem-po_to_json-2.0.0-1.15.aarch64.rpm"
RPM_HASH = "dacd86272896e26c45a19766ca4dcd3a1290cfbfff966ee9ab279526fbcfe75e19e63dcb7e793f3eaae1eccf714f705b2dde4a2c115950e5f6e46566dc5739de"

RPROVIDES:${PN} += "ruby4.0-rubygem-po-to-json \
rubygem-po-to-json \
rubygem-ruby-4.0.0-po-to-json \
rubygem-ruby-4.0.0-po-to-json-2 \
rubygem-ruby-4.0.0-po-to-json-2.0 \
rubygem-ruby-4.0.0-po-to-json-2.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-json"

inherit rpm
