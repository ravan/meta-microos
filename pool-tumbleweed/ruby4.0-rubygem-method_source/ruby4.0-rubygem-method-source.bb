SUMMARY = "retrieve the sourcecode for a method"
DESCRIPTION = "retrieve the sourcecode for a method."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ruby4.0-rubygem-method_source-1.1.0-1.11.aarch64.rpm"
RPM_HASH = "acc4c6cfe8cfc5e9bb5788f3c52ef1d49b05a27af4080042cd01b0a38e9233ffc2fdb776b5dfb2d4dec2bd2cf01540d47c838f437ccd63a4f33d344c63a81750"

RPROVIDES:${PN} += "ruby4.0-rubygem-method-source \
rubygem-method-source \
rubygem-ruby-4.0.0-method-source \
rubygem-ruby-4.0.0-method-source-1 \
rubygem-ruby-4.0.0-method-source-1.1 \
rubygem-ruby-4.0.0-method-source-1.1.0"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
