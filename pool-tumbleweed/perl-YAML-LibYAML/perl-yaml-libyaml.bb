SUMMARY = "Perl YAML Serialization using XS and libyaml"
DESCRIPTION = "Perl YAML Serialization using XS and libyaml"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.910.0"

RPM_NAME = "perl-YAML-LibYAML-0.910.0-1.3.aarch64.rpm"
RPM_HASH = "6a9138dabe7ac2961aa12f470b613ce70abe4018a9174a08eab3f772adc470ea8b996a13f42b59989edf80385f8e3e32ccc54bbfa0d75c0a91caa86f932c8dd4"

RPROVIDES:${PN} += "perl-YAML--LibYAML \
perl-YAML--XS \
perl-YAML--XS--LibYAML \
perl-YAML-LibYAML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
