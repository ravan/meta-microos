SUMMARY = "Domain name parser based on the Public Suffix List"
DESCRIPTION = "PublicSuffix can parse and decompose a domain name into top level domain, \
domain and subdomains."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "ruby4.0-rubygem-public_suffix-5.0.4-1.11.aarch64.rpm"
RPM_HASH = "b9a7fd730d69be3bcbb360d96b4a17e5922cc1093e46f96ea3023714c0e28707b6ab0209fb1d5c830a392375e391ccc09f50d66791e60388ed46ea154abd369e"

RPROVIDES:${PN} += "ruby4.0-rubygem-public-suffix \
rubygem-public-suffix \
rubygem-ruby-4.0.0-public-suffix \
rubygem-ruby-4.0.0-public-suffix-5 \
rubygem-ruby-4.0.0-public-suffix-5.0 \
rubygem-ruby-4.0.0-public-suffix-5.0.4"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
