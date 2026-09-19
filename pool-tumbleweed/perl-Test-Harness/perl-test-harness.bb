SUMMARY = "Run Perl standard test scripts with statistics"
DESCRIPTION = "Although, for historical reasons, the Test::Harness distribution takes its \
name from this module it now exists only to provide TAP::Harness with an \
interface that is somewhat backwards compatible with Test::Harness 2.xx. If \
you're writing new code consider using TAP::Harness directly instead. \
 \
Emulation is provided for 'runtests' and 'execute_tests' but the pluggable \
'Straps' interface that previous versions of Test::Harness supported is not \
reproduced here. Straps is now available as a stand alone module: \
Test::Harness::Straps. \
 \
See TAP::Parser, TAP::Harness for the main documentation for this \
distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.52"

RPM_NAME = "perl-Test-Harness-3.52-1.7.noarch.rpm"
RPM_HASH = "d584a71d665a21f7bb64113773a9af850689aaae9f17e0d6216a67a1823a0226c7a89ceabb422164fdb7c6b3137aa2729b26e5933eb6d4d939f106ed3f765149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Prove \
perl-App--Prove--State \
perl-App--Prove--State--Result \
perl-App--Prove--State--Result--Test \
perl-TAP--Base \
perl-TAP--Formatter--Base \
perl-TAP--Formatter--Color \
perl-TAP--Formatter--Console \
perl-TAP--Formatter--Console--ParallelSession \
perl-TAP--Formatter--Console--Session \
perl-TAP--Formatter--File \
perl-TAP--Formatter--File--Session \
perl-TAP--Formatter--Session \
perl-TAP--Harness \
perl-TAP--Harness--Env \
perl-TAP--Object \
perl-TAP--Parser \
perl-TAP--Parser--Aggregator \
perl-TAP--Parser--Grammar \
perl-TAP--Parser--Iterator \
perl-TAP--Parser--Iterator--Array \
perl-TAP--Parser--Iterator--Process \
perl-TAP--Parser--Iterator--Stream \
perl-TAP--Parser--IteratorFactory \
perl-TAP--Parser--Multiplexer \
perl-TAP--Parser--Result \
perl-TAP--Parser--Result--Bailout \
perl-TAP--Parser--Result--Comment \
perl-TAP--Parser--Result--Plan \
perl-TAP--Parser--Result--Pragma \
perl-TAP--Parser--Result--Test \
perl-TAP--Parser--Result--Unknown \
perl-TAP--Parser--Result--Version \
perl-TAP--Parser--Result--YAML \
perl-TAP--Parser--ResultFactory \
perl-TAP--Parser--Scheduler \
perl-TAP--Parser--Scheduler--Job \
perl-TAP--Parser--Scheduler--Spinner \
perl-TAP--Parser--Source \
perl-TAP--Parser--SourceHandler \
perl-TAP--Parser--SourceHandler--Executable \
perl-TAP--Parser--SourceHandler--File \
perl-TAP--Parser--SourceHandler--Handle \
perl-TAP--Parser--SourceHandler--Perl \
perl-TAP--Parser--SourceHandler--RawTAP \
perl-TAP--Parser--YAMLish--Reader \
perl-TAP--Parser--YAMLish--Writer \
perl-Test--Harness \
perl-Test-Harness"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
