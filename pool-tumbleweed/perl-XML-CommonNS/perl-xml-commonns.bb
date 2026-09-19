SUMMARY = "A list of commonly used namespaces"
DESCRIPTION = "A list of commonly used namespaces"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-XML-CommonNS-0.06-1.41.noarch.rpm"
RPM_HASH = "a05f114df17e34c31ce6c415ce973aee3202002b79e16ea0a67be6e336d38540699d55dd746e009006d85454317040f0a857c398ae8c149a4843b9490f171d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--CommonNS \
perl-XML-CommonNS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--NamespaceFactory \
perl-version"

inherit rpm
