SUMMARY = "Shim library for Module#ruby2_keywords"
DESCRIPTION = "Shim library for Module#ruby2_keywords."
LICENSE = "BSD-2-Clause & Ruby"

PV = "0.0.5"

RPM_NAME = "ruby4.0-rubygem-ruby2_keywords-0.0.5-1.25.aarch64.rpm"
RPM_HASH = "487649c815781b7e681439be2a94c1312f25dcffcd3bad89810c37ec32b6b7360acf132b0ff9b9820a8122f5b92793d536eae84ec18f85d431d0e4910a15cdec"

RPROVIDES:${PN} += "ruby4.0-rubygem-ruby2-keywords \
rubygem-ruby-4.0.0-ruby2-keywords \
rubygem-ruby-4.0.0-ruby2-keywords-0 \
rubygem-ruby-4.0.0-ruby2-keywords-0.0 \
rubygem-ruby-4.0.0-ruby2-keywords-0.0.5 \
rubygem-ruby2-keywords"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
