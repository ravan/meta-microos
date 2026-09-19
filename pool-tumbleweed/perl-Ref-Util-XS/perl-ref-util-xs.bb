SUMMARY = "XS implementation for Ref::Util"
DESCRIPTION = "Ref::Util::XS is the XS implementation of Ref::Util, which provides several \
functions to help identify references in a more convenient way than the \
usual approach of examining the return value of 'ref'. \
 \
You should use Ref::Util::XS by installing Ref::Util itself: if the system \
you install it on has a C compiler available, 'Ref::Util::XS' will be \
installed and used automatically, providing a significant speed boost to \
everything that uses 'Ref::Util'. \
 \
See Ref::Util for full documentation of the available functions."
LICENSE = "MIT"

PV = "0.117"

RPM_NAME = "perl-Ref-Util-XS-0.117-1.34.aarch64.rpm"
RPM_HASH = "584860c57dd41736576ef62a528d2b09a92d09bc8f6c45e29c1ce44e99f26feb02a3bd4de6b35086e3e73cd9c568cd0d9c341e9e680abe781c38d62ee001bd55"

RPROVIDES:${PN} += "perl-Ref--Util--XS \
perl-Ref-Util-XS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
