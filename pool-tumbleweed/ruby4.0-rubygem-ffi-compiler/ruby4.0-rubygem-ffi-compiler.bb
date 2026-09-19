SUMMARY = "Ruby FFI Rakefile generator"
DESCRIPTION = "Ruby FFI library."
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "ruby4.0-rubygem-ffi-compiler-1.3.2-1.11.aarch64.rpm"
RPM_HASH = "8bbea6eefe53189721989d5d36a303f58699b6d797bf36554d659a52d34a2b9cc828f0d323f5f85d2fc9ab81f198e9d46d8ca9cbbd85726932d06aa163e1586e"

RPROVIDES:${PN} += "ruby4.0-rubygem-ffi-compiler \
rubygem-ffi-compiler \
rubygem-ruby-4.0.0-ffi-compiler \
rubygem-ruby-4.0.0-ffi-compiler-1 \
rubygem-ruby-4.0.0-ffi-compiler-1.3 \
rubygem-ruby-4.0.0-ffi-compiler-1.3.2"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ffi \
rubygem-ruby-4.0.0-rake"

inherit rpm
