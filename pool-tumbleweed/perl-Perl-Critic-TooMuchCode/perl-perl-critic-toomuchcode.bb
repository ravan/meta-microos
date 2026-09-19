SUMMARY = "Perlcritic add-ons that generally check for dead code"
DESCRIPTION = "This add-on for Perl::Critic is aiming for identifying trivial dead code. \
Either the ones that has no use, or the one that produce no effect. Having \
dead code floating around causes maintenance burden. Some might prefer not \
to generate them in the first place."
LICENSE = "MIT"

PV = "0.190.0"

RPM_NAME = "perl-Perl-Critic-TooMuchCode-0.190.0-2.7.noarch.rpm"
RPM_HASH = "a5d8a0f134eb39389d076dbb790e5e4283ef38af3f51e7812f9ef41c9fa35339a896617a1373f05c0e292541650549b1dcf7583fca95c46388701041ff87205f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--Critic--Policy--TooMuchCode--ProhibitDuplicateLiteral \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitDuplicateSub \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitExcessiveColons \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitExtraStricture \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitLargeBlock \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitLargeTryBlock \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitUnnecessaryScalarKeyword \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitUnnecessaryUTF8Pragma \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitUnusedConstant \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitUnusedImport \
perl-Perl--Critic--Policy--TooMuchCode--ProhibitUnusedInclude \
perl-Perl--Critic--TooMuchCode \
perl-Perl-Critic-TooMuchCode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--Util \
perl-PPIx--QuoteLike \
perl-PPIx--Utils \
perl-Perl--Critic \
perl-Scalar--Util \
perl-version"

inherit rpm
