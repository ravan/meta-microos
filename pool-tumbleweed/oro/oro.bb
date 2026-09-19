SUMMARY = "Full regular expressions API"
DESCRIPTION = "The Jakarta-ORO Java classes are a set of text-processing Java classes \
that provide Perl5 compatible regular expressions, AWK-like regular \
expressions, glob expressions, and utility classes for performing \
substitutions, splits, filtering filenames, etc. This library is the \
successor to the OROMatcher, AwkTools, PerlTools, and TextTools \
libraries from ORO, Inc. (www.oroinc.com). They have been donated to \
the Jakarta Project by Daniel Savarese (www.savarese.org), the \
copyright holder of the ORO libraries. Daniel will continue to \
participate in their development under the Jakarta Project."
LICENSE = "Apache-2.0"

PV = "2.0.8"

RPM_NAME = "oro-2.0.8-298.8.noarch.rpm"
RPM_HASH = "ec0fbe07096c1457ae987084b4729ce9ed186b5fd353876df41d62f2ed5f318a4583513637f5871336a70e87f850ae71096b349c97390675e2383ecfeb19c3d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-oro \
mvn-oro-oro \
mvn-oro-oro-pom- \
oro"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
