SUMMARY = "Wrapper for perl's configuration"
DESCRIPTION = "ExtUtils::Config is an abstraction around the %Config hash. By itself it is \
not a particularly interesting module by any measure, however it ties \
together a family of modern toolchain modules."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.10.0"

RPM_NAME = "perl-ExtUtils-Config-0.10.0-1.10.noarch.rpm"
RPM_HASH = "14f08788663fab55ce9deb980c065aed0fd732e6a9760aad44c8f86bdbfc76868a95811c4cc258e97a4acd6f4d54236a041e87b3135072b2dd1c9eaafe315355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Config \
perl-ExtUtils--Config--MakeMaker \
perl-ExtUtils-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
