SUMMARY = "Mocking and stubbing library"
DESCRIPTION = "Mocking and stubbing library with JMock/SchMock syntax, which allows mocking \
and stubbing of methods on real (non-mock) classes."
LICENSE = "BSD-2-Clause & MIT"

PV = "2.5.0"

RPM_NAME = "ruby4.0-rubygem-mocha-2.5.0-1.10.aarch64.rpm"
RPM_HASH = "76340f5d5f3cf10fa8a4f2cfa361ddefe5d7d0ed8e4d6344445328e70e8b9010ed761bd5436cfb67daa493ce9d36fd9089c109856568b60109976fe103b23a60"

RPROVIDES:${PN} += "ruby4.0-rubygem-mocha \
rubygem-mocha \
rubygem-ruby-4.0.0-mocha \
rubygem-ruby-4.0.0-mocha-2 \
rubygem-ruby-4.0.0-mocha-2.5 \
rubygem-ruby-4.0.0-mocha-2.5.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-ruby2-keywords"

inherit rpm
