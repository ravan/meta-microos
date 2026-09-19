SUMMARY = "A declarative way to read and write binary file formats"
DESCRIPTION = "BinData is a declarative way to read and write binary file formats. \
This means the programmer specifies *what* the format of the binary \
data is, and BinData works out *how* to read and write data in this \
format.  It is an easier ( and more readable ) alternative to \
ruby's #pack and #unpack methods."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "ruby4.0-rubygem-bindata-2.5.0-1.11.aarch64.rpm"
RPM_HASH = "11853ad5a1b216999e6dd0dfe351a67bcd9feaf7ffda2ea9f1927775ac06bb3d5dc67d3a90dee21c022838820283764dc23d18889c83f950c088976957b97e73"

RPROVIDES:${PN} += "ruby4.0-rubygem-bindata \
rubygem-bindata \
rubygem-ruby-4.0.0-bindata \
rubygem-ruby-4.0.0-bindata-2 \
rubygem-ruby-4.0.0-bindata-2.5 \
rubygem-ruby-4.0.0-bindata-2.5.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
