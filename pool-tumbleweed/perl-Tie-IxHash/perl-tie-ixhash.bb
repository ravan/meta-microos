SUMMARY = "ordered associative arrays for Perl"
DESCRIPTION = "This Perl module implements Perl hashes that preserve the order in which \
the hash elements were added. The order is not affected when values \
corresponding to existing keys in the IxHash are changed. The elements can \
also be set to any arbitrary supplied order. The familiar perl array \
operations can also be performed on the IxHash."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.23"

RPM_NAME = "perl-Tie-IxHash-1.23-5.40.noarch.rpm"
RPM_HASH = "25e0a5354cb112882bed7201e47ab1278aecc9f111d527dc8b5e698315edc8bed12018eff2e534232e2811fef42bd44b897c6fa9942fbc927907c1c30bb1ba11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--IxHash \
perl-Tie-IxHash"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
