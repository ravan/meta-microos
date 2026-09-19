SUMMARY = "Provides Moose-Like Method Modifiers"
DESCRIPTION = "Method modifiers are a powerful feature from the CLOS (Common Lisp Object \
System) world. \
 \
'Class::Method::Modifiers::Fast' provides three modifiers: 'before', \
'around', and 'after'. 'before' and 'after' are run just before and after \
the method they modify, but can not really affect that original method. \
'around' is run in place of the original method, with a hook to easily call \
that original method. See the 'MODIFIERS' section for more details on how \
the particular modifiers work."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.041"

RPM_NAME = "perl-Class-Method-Modifiers-Fast-0.041-15.36.noarch.rpm"
RPM_HASH = "736c7915bcd9d62a312a3bf4e4156757acb4461c1039f769c056f53774f69647d77597e45e6d552d85822ab04f63fce24f8b7c741a31fc0f2153b3b6649d34ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Method--Modifiers--Fast \
perl-Class-Method-Modifiers-Fast"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Util"

inherit rpm
