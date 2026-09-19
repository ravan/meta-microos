SUMMARY = "Annotate and delegate hooked OPs"
DESCRIPTION = "This module provides a way for XS code that hijacks OP 'op_ppaddr' \
functions to delegate to (or restore) the previous functions, whether \
assigned by perl or by another module. Typically this should be used in \
conjunction with B::Hooks::OP::Check. \
 \
'B::Hooks::OP::Annotation' makes its types and functions available to XS \
code by means of ExtUtils::Depends. Modules that wish to use these exports \
in their XS code should 'use B::OP::Hooks::Annotation' in the Perl module \
that loads the XS, and include something like the following in their \
Makefile.PL: \
 \
    use ExtUtils::MakeMaker; \
    use ExtUtils::Depends; \
 \
    our %XS_PREREQUISITES = ( \
        'B::Hooks::OP::Annotation' => '0.44', \
        'B::Hooks::OP::Check'      => '0.15', \
    ); \
 \
    our %XS_DEPENDENCIES = ExtUtils::Depends->new( \
        'Your::XS::Module', \
         keys(%XS_PREREQUISITES) \
    )->get_makefile_vars(); \
 \
    WriteMakefile( \
        NAME          => 'Your::XS::Module', \
        VERSION_FROM  => 'lib/Your/XS/Module.pm', \
        PREREQ_PM => { \
            'B::Hooks::EndOfScope' => '0.07', \
            %XS_PREREQUISITES \
        }, \
        ($ExtUtils::MakeMaker::VERSION >= 6.46 ? \
            (META_MERGE => { \
                configure_requires => { \
                    'ExtUtils::Depends' => '0.301', \
                    %XS_PREREQUISITES \
                }}) \
            : () \
        ), \
        %XS_DEPENDENCIES, \
         \
    );"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.440.0"

RPM_NAME = "perl-B-Hooks-OP-Annotation-0.440.0-1.8.aarch64.rpm"
RPM_HASH = "ae72e959117f52d763ca3422c4db859cf06553013e1053604d6e5811e39cd904252a831584cc6be20090b4feb9a8e64d7817457f9ccb89965178d4d8f229cecd"

RPROVIDES:${PN} += "perl-B--Hooks--OP--Annotation \
perl-B-Hooks-OP-Annotation"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--Depends"

inherit rpm
