SUMMARY = "Mixes in simple per-request authentication"
DESCRIPTION = "Mixes in simple per-request authentication."
LICENSE = "Apache-2.0"

PV = "3.0.10"

RPM_NAME = "ruby4.0-rubygem-mixlib-authentication-3.0.10-1.25.aarch64.rpm"
RPM_HASH = "b6e06296e4e5e41b97d4cc6f24db8d02cf924c0e3f404623e1e190096d7700e43562147ebedd7bed8e5c86e3250e606a3d556173c7472d68413d70e8d6fca583"

RPROVIDES:${PN} += "ruby4.0-rubygem-mixlib-authentication \
rubygem-mixlib-authentication \
rubygem-ruby-4.0.0-mixlib-authentication \
rubygem-ruby-4.0.0-mixlib-authentication-3 \
rubygem-ruby-4.0.0-mixlib-authentication-3.0 \
rubygem-ruby-4.0.0-mixlib-authentication-3.0.10"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
