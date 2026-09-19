SUMMARY = "Play trics with HASH keys"
DESCRIPTION = "Hash::Case is the base class for various classes which tie special \
treatment for the casing of keys. Be aware of the differences in \
implementation: 'Lower' and 'Upper' are tied native hashes: these hashes \
have no need for hidden fields or other assisting data structured. A case \
'Preserve' hash will actually create three hashes. \
 \
The following strategies are implemented: \
 \
* * Hash::Case::Lower (native hash) \
 \
Keys are always considered lower case. The internals of this module \
translate any incoming key to lower case before it is used. \
 \
* * Hash::Case::Upper (native hash) \
 \
Like the ::Lower, but then all keys are always translated into upper case. \
This module can be of use for some databases, which do translate everything \
to capitals as well. To avoid confusion, you may want to have you own \
internal Perl hash do this as well. \
 \
* * Hash::Case::Preserve \
 \
The actual casing is ignored, but not forgotten."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.70.0"

RPM_NAME = "perl-Hash-Case-1.70.0-1.3.noarch.rpm"
RPM_HASH = "6ce290e92761cbeb0604559fc65c79622602f3500cae5e11f877dbe8774571e30383fb5ea9ab396a3b85d2340c77822847141c01d3deaa9f208915735c4a644c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Case \
perl-Hash--Case--Lower \
perl-Hash--Case--Preserve \
perl-Hash--Case--Upper \
perl-Hash-Case"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
