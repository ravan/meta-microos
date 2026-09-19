SUMMARY = "Lexically-Scoped Resource Management"
DESCRIPTION = "This module provides a convenient way to perform cleanup or other forms of \
resource management at the end of a scope. It is particularly useful when \
dealing with exceptions: the 'Scope::Guard' constructor takes a reference \
to a subroutine that is guaranteed to be called even if the thread of \
execution is aborted prematurely. This effectively allows lexically-scoped \
'promises' to be made that are automatically honoured by perl's garbage \
collector. \
 \
For more information, see: the http://www.drdobbs.com/cpp/184403758 manpage"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Scope-Guard-0.21-1.42.noarch.rpm"
RPM_HASH = "ff200ed4f05485ae3af8cc2a486954fd36ee31aa74d73a611545fe948bf7b5830e144207641f28a3273d51040aa8437f124b12ff467f1641557b55e4d6674130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Scope--Guard \
perl-Scope-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
