SUMMARY = "YAML Ain't Markup Language™"
DESCRIPTION = "The YAML.pm module implements a YAML Loader and Dumper based on the YAML \
1.0 specification. http://www.yaml.org/spec/ \
 \
YAML is a generic data serialization language that is optimized for human \
readability. It can be used to express the data structures of most modern \
programming languages. (Including Perl!!!) \
 \
For information on the YAML syntax, please refer to the YAML specification."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.321.0"

RPM_NAME = "perl-YAML-1.321.0-1.1.noarch.rpm"
RPM_HASH = "a3f8fe2b224212244091e719b9a26d0d51e2d27a875d7c0ab216fd55df0a44d477f123f91269eae080bb818e3009eb1d17f5708783189aae33ea932663253c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML \
perl-YAML--Any \
perl-YAML--Dumper \
perl-YAML--Dumper--Base \
perl-YAML--Error \
perl-YAML--Loader \
perl-YAML--Loader--Base \
perl-YAML--Marshall \
perl-YAML--Mo \
perl-YAML--Node \
perl-YAML--Tag \
perl-YAML--Type--blessed \
perl-YAML--Type--code \
perl-YAML--Type--glob \
perl-YAML--Type--ref \
perl-YAML--Type--regexp \
perl-YAML--Type--undef \
perl-YAML--Types \
perl-YAML--Warning \
perl-yaml-mapping \
perl-yaml-scalar \
perl-yaml-sequence"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
