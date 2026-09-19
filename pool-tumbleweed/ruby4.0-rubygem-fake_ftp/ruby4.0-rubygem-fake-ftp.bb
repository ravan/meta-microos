SUMMARY = "A fake FTP server for use with RSpec"
DESCRIPTION = "This is a gem that allows you to test FTP implementations in ruby. It is a minimal single-client FTP server that can be bound to any arbitrary port on localhost."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "ruby4.0-rubygem-fake_ftp-0.3.0-1.32.aarch64.rpm"
RPM_HASH = "ebb6d4cf56bbe77df66fd9ef6f4b2961873afbd7b17013aa9b17e4296528086b47f8a39a1277ece0adfc25f1d0d2e0b03c9d606c1ad17935ce1551e83d637e69"

RPROVIDES:${PN} += "ruby4.0-rubygem-fake-ftp \
rubygem-fake-ftp \
rubygem-ruby-4.0.0-fake-ftp \
rubygem-ruby-4.0.0-fake-ftp-0 \
rubygem-ruby-4.0.0-fake-ftp-0.3 \
rubygem-ruby-4.0.0-fake-ftp-0.3.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
