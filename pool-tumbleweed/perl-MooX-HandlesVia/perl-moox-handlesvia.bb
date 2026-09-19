SUMMARY = "NativeTrait-like behavior for Moo"
DESCRIPTION = "MooX::HandlesVia is an extension of Moo's 'handles' attribute \
functionality. It provides a means of proxying functionality from an \
external class to the given atttribute. This is most commonly used as a way \
to emulate 'Native Trait' behavior that has become commonplace in Moose \
code, for which there was no Moo alternative."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.001009"

RPM_NAME = "perl-MooX-HandlesVia-0.001009-1.28.noarch.rpm"
RPM_HASH = "46642c41602257eed74c5568a003c4b3bb499336c75a56166bf9cd6b0720f3c2141836b1a1691c91b8bb80dcd150d3b0072d3140fb34066fee348eb840226413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Perl--Bool--MooseLike \
perl-Data--Perl--Collection--Array--MooseLike \
perl-Data--Perl--Collection--Hash--MooseLike \
perl-Data--Perl--Number--MooseLike \
perl-Data--Perl--String--MooseLike \
perl-MooX--HandlesVia \
perl-MooX-HandlesVia"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Method--Modifiers \
perl-Data--Perl \
perl-Module--Runtime \
perl-Moo \
perl-Role--Tiny"

inherit rpm
