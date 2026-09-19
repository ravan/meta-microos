SUMMARY = "Hashdiff is a diff lib to compute the smallest difference between"
DESCRIPTION = "Hashdiff is a diff lib to compute the smallest difference between two hashes. \
."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ruby4.0-rubygem-hashdiff-1.1.2-1.8.aarch64.rpm"
RPM_HASH = "abb939ebf5147ca5f3cf3f20132d8f7e0100eb019ee550324f7cb6f6ab584ba023782b0c11831ca5f4ab9dd57ee8e61c870d855c598a1526a3117da6aa06e3d8"

RPROVIDES:${PN} += "ruby4.0-rubygem-hashdiff \
rubygem-hashdiff \
rubygem-ruby-4.0.0-hashdiff \
rubygem-ruby-4.0.0-hashdiff-1 \
rubygem-ruby-4.0.0-hashdiff-1.1 \
rubygem-ruby-4.0.0-hashdiff-1.1.2"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
