SUMMARY = "Some add-on policies for Perl::Critic"
DESCRIPTION = "This is a collection of add-on policies for 'Perl::Critic'. They're under a \
'pulp' theme plus other themes according to their purpose (see \
Perl::Critic/POLICY THEMES)."
LICENSE = "GPL-3.0-or-later"

PV = "100.0.0"

RPM_NAME = "perl-Perl-Critic-Pulp-100.0.0-1.3.aarch64.rpm"
RPM_HASH = "079099220783b31821feb7d0a0ed5fe26393d0bf8fd8546311158c37936cf216056b7d267c62f54d1c76d5c0fbef12266f940ae48ba5a4afcc2cc821812d5f68"

RPROVIDES:${PN} += "perl-Perl--Critic--PodParser--ProhibitVerbatimMarkup \
perl-Perl--Critic--Policy--CodeLayout--ProhibitFatCommaNewline \
perl-Perl--Critic--Policy--CodeLayout--ProhibitIfIfSameLine \
perl-Perl--Critic--Policy--CodeLayout--RequireFinalSemicolon \
perl-Perl--Critic--Policy--CodeLayout--RequireTrailingCommaAtNewline \
perl-Perl--Critic--Policy--Compatibility--ConstantLeadingUnderscore \
perl-Perl--Critic--Policy--Compatibility--ConstantPragmaHash \
perl-Perl--Critic--Policy--Compatibility--Gtk2Constants \
perl-Perl--Critic--Policy--Compatibility--PerlMinimumVersionAndWhy \
perl-Perl--Critic--Policy--Compatibility--PodMinimumVersion \
perl-Perl--Critic--Policy--Compatibility--ProhibitUnixDevNull \
perl-Perl--Critic--Policy--Documentation--ProhibitAdjacentLinks \
perl-Perl--Critic--Policy--Documentation--ProhibitAdjacentLinks--Parser \
perl-Perl--Critic--Policy--Documentation--ProhibitBadAproposMarkup \
perl-Perl--Critic--Policy--Documentation--ProhibitDuplicateHeadings \
perl-Perl--Critic--Policy--Documentation--ProhibitDuplicateSeeAlso \
perl-Perl--Critic--Policy--Documentation--ProhibitLinkToSelf \
perl-Perl--Critic--Policy--Documentation--ProhibitParagraphEndComma \
perl-Perl--Critic--Policy--Documentation--ProhibitParagraphTwoDots \
perl-Perl--Critic--Policy--Documentation--ProhibitUnbalancedParens \
perl-Perl--Critic--Policy--Documentation--ProhibitVerbatimMarkup \
perl-Perl--Critic--Policy--Documentation--RequireEndBeforeLastPod \
perl-Perl--Critic--Policy--Documentation--RequireFilenameMarkup \
perl-Perl--Critic--Policy--Documentation--RequireFinalCut \
perl-Perl--Critic--Policy--Documentation--RequireLinkedURLs \
perl-Perl--Critic--Policy--Miscellanea--TextDomainPlaceholders \
perl-Perl--Critic--Policy--Miscellanea--TextDomainUnused \
perl-Perl--Critic--Policy--Modules--ProhibitModuleShebang \
perl-Perl--Critic--Policy--Modules--ProhibitPOSIXimport \
perl-Perl--Critic--Policy--Modules--ProhibitUseQuotedVersion \
perl-Perl--Critic--Policy--ValuesAndExpressions--ConstantBeforeLt \
perl-Perl--Critic--Policy--ValuesAndExpressions--NotWithCompare \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitArrayAssignAref \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitBarewordDoubleColon \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitDuplicateHashKeys \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitEmptyCommas \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitFiletest-f \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitNullStatements \
perl-Perl--Critic--Policy--ValuesAndExpressions--ProhibitUnknownBackslash \
perl-Perl--Critic--Policy--ValuesAndExpressions--RequireNumericVersion \
perl-Perl--Critic--Policy--ValuesAndExpressions--UnexpandedSpecialLiteral \
perl-Perl--Critic--Pulp \
perl-Perl--Critic--Pulp--PodMinimumVersionViolation \
perl-Perl--Critic--Pulp--PodParser \
perl-Perl--Critic--Pulp--PodParser--ProhibitBadAproposMarkup \
perl-Perl--Critic--Pulp--PodParser--ProhibitDuplicateHeadings \
perl-Perl--Critic--Pulp--PodParser--ProhibitDuplicateSeeAlso \
perl-Perl--Critic--Pulp--PodParser--ProhibitLinkToSelf \
perl-Perl--Critic--Pulp--PodParser--ProhibitParagraphEndComma \
perl-Perl--Critic--Pulp--PodParser--ProhibitParagraphTwoDots \
perl-Perl--Critic--Pulp--PodParser--ProhibitUnbalancedParens \
perl-Perl--Critic--Pulp--PodParser--RequireFilenameMarkup \
perl-Perl--Critic--Pulp--PodParser--RequireFinalCut \
perl-Perl--Critic--Pulp--PodParser--RequireLinkedURLs \
perl-Perl--Critic--Pulp--ProhibitDuplicateHashKeys--Qword \
perl-Perl--Critic--Pulp--Utils \
perl-Perl--MinimumVersion \
perl-Perl-Critic-Pulp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IO--String \
perl-List--MoreUtils \
perl-PPI \
perl-PPI--Document \
perl-PPI--Dumper \
perl-Perl--Critic \
perl-Perl--Critic--Policy \
perl-Perl--Critic--Utils \
perl-Perl--Critic--Utils--PPI \
perl-Perl--Critic--Violation \
perl-Pod--Escapes \
perl-Pod--MinimumVersion \
perl-Pod--Parser \
perl-version"

inherit rpm
