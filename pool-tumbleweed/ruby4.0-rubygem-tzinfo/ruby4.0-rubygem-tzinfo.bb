SUMMARY = "Time Zone Library"
DESCRIPTION = "TZInfo provides access to time zone data and allows times to be converted \
using time zone rules."
LICENSE = "MIT"

PV = "2.0.6"

RPM_NAME = "ruby4.0-rubygem-tzinfo-2.0.6-1.15.aarch64.rpm"
RPM_HASH = "bad6be9d5516a1c63ab6c716e33b5cd59d5b0e417ca4c15e0fd686dcd49d3bcc825f370ce3932d17ce9dc3d28b999363f0995a4921aa6260de23f584080afbda"

RPROVIDES:${PN} += "ruby4.0-rubygem-tzinfo \
rubygem-ruby-4.0.0-tzinfo \
rubygem-ruby-4.0.0-tzinfo-2 \
rubygem-ruby-4.0.0-tzinfo-2.0 \
rubygem-ruby-4.0.0-tzinfo-2.0.6 \
rubygem-tzinfo"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-concurrent-ruby-1 \
timezone"

inherit rpm
