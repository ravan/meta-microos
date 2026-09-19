SUMMARY = "Another way of exporting symbols"
DESCRIPTION = "This module serves as an easy, clean alternative to Exporter. Unlike \
Exporter, it is not subclassed, but it simply exports a custom import() \
into your namespace. \
 \
With Exporter::Tidy, you don't need to use any package global in your \
module. Even the subs you export can be lexically scoped."
LICENSE = "SUSE-Public-Domain"

PV = "0.90.0"

RPM_NAME = "perl-Exporter-Tidy-0.90.0-1.9.noarch.rpm"
RPM_HASH = "af734be62fa066cef2c11d550048f271f74ed8268afe2eb83788dba57d9b5e8a2e7bef04dc8a5288ee230ed7d92f8678915cd46eb4a3a4b7054e9c134635f150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Tidy \
perl-Exporter-Tidy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
