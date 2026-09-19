SUMMARY = "Fast mime detection by extension or content"
DESCRIPTION = "Fast mime detection by extension or content (Uses freedesktop.org.xml \
shared-mime-info database)."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "ruby4.0-rubygem-mimemagic-0.4.3-1.24.aarch64.rpm"
RPM_HASH = "8617b8213a596f7edf34e46daf6e12db751280c257231303c8faf21e4f47254ee8ff436a489a6917bd4bd74c127817be5f0702951500f8daadf51aff3e58ccaa"

RPROVIDES:${PN} += "ruby4.0-rubygem-mimemagic \
rubygem-mimemagic \
rubygem-ruby-4.0.0-mimemagic \
rubygem-ruby-4.0.0-mimemagic-0 \
rubygem-ruby-4.0.0-mimemagic-0.4 \
rubygem-ruby-4.0.0-mimemagic-0.4.3"

RDEPENDS:${PN} += "ruby-abi \
ruby4.0-without-jemalloc \
ruby4.0-without-yjit \
rubygem-ruby-4.0.0-nokogiri \
rubygem-ruby-4.0.0-rake \
shared-mime-info"

inherit rpm
