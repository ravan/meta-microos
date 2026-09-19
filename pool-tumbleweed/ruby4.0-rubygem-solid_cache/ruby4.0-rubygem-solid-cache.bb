SUMMARY = "A database backed ActiveSupport::Cache::Store"
DESCRIPTION = "A database backed ActiveSupport::Cache::Store."
LICENSE = "MIT"

PV = "1.0.10"

RPM_NAME = "ruby4.0-rubygem-solid_cache-1.0.10-1.2.aarch64.rpm"
RPM_HASH = "4ea438cdf4d1c40822c97900b21568d564035c427102ad3f3192c55f98bc12b323d11f82d45f332034393e2a7ba90047e586a459a6a547867ca2eb26898e1b84"

RPROVIDES:${PN} += "ruby4.0-rubygem-solid-cache \
rubygem-ruby-4.0.0-solid-cache \
rubygem-ruby-4.0.0-solid-cache-1 \
rubygem-ruby-4.0.0-solid-cache-1.0 \
rubygem-ruby-4.0.0-solid-cache-1.0.10 \
rubygem-solid-cache"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activejob \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-railties"

inherit rpm
