SUMMARY = "Define TRUE and FALSE constants."
DESCRIPTION = "Defines 'TRUE' and 'FALSE' constants in caller's namespace. You could use \
simple values like empty string or zero for false, or any non-empty and \
non-zero string value as true, but the 'TRUE' and 'FALSE' constants are \
more descriptive. \
 \
It is virtually the same as: \
 \
   \
  use constant TRUE => !! 1; \
  use constant FALSE => !! ''; \
 \
The constants exported by 'constant::boolean' are not reported by the \
Test::Pod::Coverage manpage, so it is more convenient to use this module \
than to define 'TRUE' and 'FALSE' constants by yourself. \
 \
The constants can be removed from class API with 'no constant::boolean' \
pragma or some universal tool like the namespace::clean manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-constant-boolean-0.02-9.40.noarch.rpm"
RPM_HASH = "9cab21b00f330c23dd4ae98b56611c1d72705549e7873e7b73ffbfa3a16c95c5c6dc6f2a90f5f0716ccc72ab2a8d610150e9d7db79ed1314e3fb19044802786e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-constant--boolean \
perl-constant-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Symbol--Util"

inherit rpm
