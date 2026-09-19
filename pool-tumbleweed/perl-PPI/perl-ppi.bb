SUMMARY = "Parse, Analyze and Manipulate Perl (without perl)"
DESCRIPTION = "Parse, Analyze and Manipulate Perl (without perl)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.291.0"

RPM_NAME = "perl-PPI-1.291.0-1.3.noarch.rpm"
RPM_HASH = "55b59497fcd668925afc78c7bf4c8bb30dae70043cac3e7fae98f6a8b7100706337e3c9468fbdb5b42a98e236217fd4713fa940f347ddd96bbe7b2fba80972f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-PPI \
perl-PPI--Cache \
perl-PPI--Document \
perl-PPI--Document--File \
perl-PPI--Document--Fragment \
perl-PPI--Document--Normalized \
perl-PPI--Dumper \
perl-PPI--Element \
perl-PPI--Exception \
perl-PPI--Exception--ParserRejection \
perl-PPI--Find \
perl-PPI--Lexer \
perl-PPI--Node \
perl-PPI--Normal \
perl-PPI--Normal--Standard \
perl-PPI--Singletons \
perl-PPI--Statement \
perl-PPI--Statement--Break \
perl-PPI--Statement--Compound \
perl-PPI--Statement--Data \
perl-PPI--Statement--End \
perl-PPI--Statement--Expression \
perl-PPI--Statement--Given \
perl-PPI--Statement--Include \
perl-PPI--Statement--Include--Perl6 \
perl-PPI--Statement--Null \
perl-PPI--Statement--Package \
perl-PPI--Statement--Scheduled \
perl-PPI--Statement--Sub \
perl-PPI--Statement--Unknown \
perl-PPI--Statement--UnmatchedBrace \
perl-PPI--Statement--Variable \
perl-PPI--Statement--When \
perl-PPI--Structure \
perl-PPI--Structure--Block \
perl-PPI--Structure--Condition \
perl-PPI--Structure--Constructor \
perl-PPI--Structure--For \
perl-PPI--Structure--Given \
perl-PPI--Structure--List \
perl-PPI--Structure--Signature \
perl-PPI--Structure--Subscript \
perl-PPI--Structure--Unknown \
perl-PPI--Structure--When \
perl-PPI--Token \
perl-PPI--Token--ArrayIndex \
perl-PPI--Token--Attribute \
perl-PPI--Token--BOM \
perl-PPI--Token--Cast \
perl-PPI--Token--Comment \
perl-PPI--Token--DashedWord \
perl-PPI--Token--Data \
perl-PPI--Token--End \
perl-PPI--Token--HereDoc \
perl-PPI--Token--Label \
perl-PPI--Token--Magic \
perl-PPI--Token--Number \
perl-PPI--Token--Number--Binary \
perl-PPI--Token--Number--Exp \
perl-PPI--Token--Number--Float \
perl-PPI--Token--Number--Hex \
perl-PPI--Token--Number--Octal \
perl-PPI--Token--Number--Version \
perl-PPI--Token--Operator \
perl-PPI--Token--Pod \
perl-PPI--Token--Prototype \
perl-PPI--Token--Quote \
perl-PPI--Token--Quote--Double \
perl-PPI--Token--Quote--Interpolate \
perl-PPI--Token--Quote--Literal \
perl-PPI--Token--Quote--Single \
perl-PPI--Token--QuoteLike \
perl-PPI--Token--QuoteLike--Backtick \
perl-PPI--Token--QuoteLike--Command \
perl-PPI--Token--QuoteLike--Readline \
perl-PPI--Token--QuoteLike--Regexp \
perl-PPI--Token--QuoteLike--Words \
perl-PPI--Token--Regexp \
perl-PPI--Token--Regexp--Match \
perl-PPI--Token--Regexp--Substitute \
perl-PPI--Token--Regexp--Transliterate \
perl-PPI--Token--Separator \
perl-PPI--Token--Structure \
perl-PPI--Token--Symbol \
perl-PPI--Token--Unknown \
perl-PPI--Token--Whitespace \
perl-PPI--Token--Word \
perl-PPI--Tokenizer \
perl-PPI--Transform \
perl-PPI--Transform--UpdateCopyright \
perl-PPI--Util \
perl-PPI--XSAccessor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Clone \
perl-List--Util \
perl-Params--Util \
perl-Safe--Isa \
perl-Storable \
perl-Task--Weaken \
perl-YAML--PP \
perl-version"

inherit rpm
