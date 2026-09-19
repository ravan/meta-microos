SUMMARY = "Tool to scan your Perl code for its prerequisites"
DESCRIPTION = "Perl::PrereqScanner::NotQuiteLite is yet another prerequisites scanner. It \
passes almost all the scanning tests for Perl::PrereqScanner and \
Module::ExtractUse (ie. except for a few dubious ones), and runs slightly \
faster than PPI-based Perl::PrereqScanner. However, it doesn't run as fast \
as Perl::PrereqScanner::Lite (which uses an XS lexer). \
 \
Perl::PrereqScanner::NotQuiteLite also recognizes 'eval'. Prerequisites in \
'eval' are not considered as requirements, but you can collect them as \
suggestions. \
 \
Conditional requirements or requirements loaded in a block are treated as \
recommends. Noed modules are stored separately (since 0.94). You may or may \
not need to merge them into requires. \
 \
Perl::PrereqScanner::NotQuiteLite can also recognize some of the new \
language features such as 'say', subroutine signatures, and postfix \
dereferences, to improve the minimum perl requirement (since 0.9905)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.9918"

RPM_NAME = "perl-Perl-PrereqScanner-NotQuiteLite-0.9918-1.4.noarch.rpm"
RPM_HASH = "2da95e14cd3a53a53e5d898973ebc476ee931b04e59b922b310cc307b75f17b2ec6f1fa26141535f3a730b786ad53093af496b3f7c7823a934e1890059029bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl--PrereqScanner--NotQuiteLite \
perl-Perl--PrereqScanner--NotQuiteLite--App \
perl-Perl--PrereqScanner--NotQuiteLite--Context \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Aliased \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--AnyMoose \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Autouse \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Catalyst \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--ClassAccessor \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--ClassAutouse \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--ClassLoad \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Core \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--FeatureCompatClass \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Inline \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--KeywordDeclare \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Later \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Mixin \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--ModuleRuntime \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--MojoBase \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Moose \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--MooseXDeclare \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--ObjectPad \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Only \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--POE \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--PackageVariant \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Plack \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Prefork \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Superclass \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Syntax \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--SyntaxCollector \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--TestClassMost \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--TestMore \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--TestRequires \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--UniversalVersion \
perl-Perl--PrereqScanner--NotQuiteLite--Parser--Unless \
perl-Perl--PrereqScanner--NotQuiteLite--Tokens \
perl-Perl--PrereqScanner--NotQuiteLite--Util \
perl-Perl--PrereqScanner--NotQuiteLite--Util--CPANfile \
perl-Perl--PrereqScanner--NotQuiteLite--Util--Prereqs \
perl-Perl-PrereqScanner-NotQuiteLite"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements \
perl-Data--Dump \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Module--Find \
perl-Parse--Distname \
perl-Regexp--Trie \
perl-parent"

inherit rpm
