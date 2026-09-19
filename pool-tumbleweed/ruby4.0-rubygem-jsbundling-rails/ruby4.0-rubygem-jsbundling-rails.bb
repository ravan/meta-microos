SUMMARY = "Bundle and transpile JavaScript in Rails with bun, esbuild,"
DESCRIPTION = "Bundle and transpile JavaScript in Rails with bun, esbuild, rollup.js, or \
Webpack."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "ruby4.0-rubygem-jsbundling-rails-1.3.1-1.10.aarch64.rpm"
RPM_HASH = "d71d53a12667db6520362e7dbf7e959c967e0c840dadcf490bb06763977821b3079dccb9f944c5549c405227a9e6ed3d4bbe8bd2b3b0625d6cdfd97576d65a88"

RPROVIDES:${PN} += "ruby4.0-rubygem-jsbundling-rails \
rubygem-jsbundling-rails \
rubygem-ruby-4.0.0-jsbundling-rails \
rubygem-ruby-4.0.0-jsbundling-rails-1 \
rubygem-ruby-4.0.0-jsbundling-rails-1.3 \
rubygem-ruby-4.0.0-jsbundling-rails-1.3.1"

RDEPENDS:${PN} += "/usr/bin/env \
ruby-abi \
rubygem-ruby-4.0.0-railties"

inherit rpm
