SUMMARY = "Velero plugin for AWS"
DESCRIPTION = "Plugins to support Velero on Amazon Web Service (AWS)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "velero-plugin-for-aws-1.4.0-2.8.aarch64.rpm"
RPM_HASH = "42e8c6664003c28f6a67ce1d303c68b0561b4ae4d64e21eb6be6d22442a5ae5b336ea4dd739718b20b2be0d7ea6897377cbeb67cc17a14b4a8ff6c994945e9e9"

RPROVIDES:${PN} += "velero-plugin-for-aws"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
