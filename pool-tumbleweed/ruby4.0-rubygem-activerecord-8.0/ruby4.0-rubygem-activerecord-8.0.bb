SUMMARY = "Object-relational mapper framework (part of Rails)"
DESCRIPTION = "Databases on Rails. Build a persistent domain model by mapping database tables \
to Ruby classes. Strong conventions for associations, validations, \
aggregations, migrations, and testing come baked-in."
LICENSE = "MIT"

PV = "8.0.5"

RPM_NAME = "ruby4.0-rubygem-activerecord-8.0-8.0.5-1.2.aarch64.rpm"
RPM_HASH = "73b76ec0b1f26e257ab5e03cb59b280d42de3f7afc06846d184d62de556428c0883590bd8374930c24aaa2b079e7a6b2548c6e582cc666a7049247ae8dd60380"

RPROVIDES:${PN} += "ruby4.0-rubygem-activerecord-8.0 \
rubygem-activerecord \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-activerecord-8 \
rubygem-ruby-4.0.0-activerecord-8.0 \
rubygem-ruby-4.0.0-activerecord-8.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activemodel \
rubygem-ruby-4.0.0-activesupport \
rubygem-ruby-4.0.0-timeout"

inherit rpm
