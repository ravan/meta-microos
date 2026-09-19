SUMMARY = "Tiny, yet Moo(se)-compatible type constraint"
DESCRIPTION = "This documents the internals of the Type::Tiny class. Type::Tiny::Manual is \
a better starting place if you're new. \
 \
Type::Tiny is a small class for creating Moose-like type constraint objects \
which are compatible with Moo, Moose and Mouse."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.010001"

RPM_NAME = "perl-Type-Tiny-2.010001-1.5.noarch.rpm"
RPM_HASH = "f9a7da7becd558f3b44df484256bf88d52839b71cce4e054136cdeed33ad19ec327140e852ed5c504d916ec81c6239265a0752b13d3f68b28f5d20ec9c89d11c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--TypeTiny--Perl58Compat \
perl-Error--TypeTiny \
perl-Error--TypeTiny--Assertion \
perl-Error--TypeTiny--Compilation \
perl-Error--TypeTiny--WrongNumberOfParameters \
perl-Eval--TypeTiny \
perl-Eval--TypeTiny--CodeAccumulator \
perl-Reply--Plugin--TypeTiny \
perl-Test--TypeTiny \
perl-Type--Coercion \
perl-Type--Coercion--FromMoose \
perl-Type--Coercion--Union \
perl-Type--Library \
perl-Type--Params \
perl-Type--Params--Alternatives \
perl-Type--Params--Parameter \
perl-Type--Params--Signature \
perl-Type--Parser \
perl-Type--Parser--AstBuilder \
perl-Type--Parser--Token \
perl-Type--Parser--TokenStream \
perl-Type--Registry \
perl-Type--Tie \
perl-Type--Tie--ARRAY \
perl-Type--Tie--BASE \
perl-Type--Tie--HASH \
perl-Type--Tie--SCALAR \
perl-Type--Tiny \
perl-Type--Tiny---DeclaredType \
perl-Type--Tiny---HalfOp \
perl-Type--Tiny--Bitfield \
perl-Type--Tiny--Class \
perl-Type--Tiny--ConstrainedObject \
perl-Type--Tiny--Duck \
perl-Type--Tiny--Enum \
perl-Type--Tiny--Intersection \
perl-Type--Tiny--Role \
perl-Type--Tiny--Union \
perl-Type--Utils \
perl-Type-Tiny \
perl-Types--Common \
perl-Types--Common--Numeric \
perl-Types--Common--String \
perl-Types--Standard \
perl-Types--Standard--ArrayRef \
perl-Types--Standard--CycleTuple \
perl-Types--Standard--Dict \
perl-Types--Standard--HashRef \
perl-Types--Standard--Map \
perl-Types--Standard--ScalarRef \
perl-Types--Standard--StrMatch \
perl-Types--Standard--Tied \
perl-Types--Standard--Tuple \
perl-Types--TypeTiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter--Tiny"

inherit rpm
