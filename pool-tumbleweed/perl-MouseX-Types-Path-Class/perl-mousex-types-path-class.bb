SUMMARY = "Path::Class type library for Mouse"
DESCRIPTION = "MouseX::Types::Path::Class creates common Mouse types, coercions and option \
specifications useful for dealing with Path::Class objects as Mouse \
attributes. \
 \
Coercions (see Mouse::Util::TypeConstraints) are made from both 'Str' and \
'ArrayRef' to both Path::Class::Dir and Path::Class::File objects. If you \
have MouseX::Getopt installed, the Getopt option type ('=s') will be added \
for both Path::Class::Dir and Path::Class::File."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-MouseX-Types-Path-Class-0.07-4.35.noarch.rpm"
RPM_HASH = "a3b04ada6e157eb95ce052a16ce05016c22b126232d576471f02208e205366b99156cefda25b5fc7360f4f98f2846afc78a8ae3c800ea4b9ac53041f6235940f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--Types--Path--Class \
perl-MouseX-Types-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mouse \
perl-MouseX--Types \
perl-Path--Class"

inherit rpm
