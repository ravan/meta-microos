SUMMARY = "Create a module Makefile"
DESCRIPTION = "This utility is designed to write a Makefile for an extension module from a \
Makefile.PL. It is based on the Makefile.SH model provided by Andy \
Dougherty and the perl5-porters. \
 \
It splits the task of generating the Makefile into several subroutines that \
can be individually overridden. Each subroutine returns the text it wishes \
to have written to the Makefile. \
 \
As there are various Make programs with incompatible syntax, which use \
operating system shells, again with incompatible syntax, it is important \
for users of this module to know which flavour of Make a Makefile has been \
written for so they'll use the correct one and won't have to face the \
possibly bewildering errors resulting from using the wrong one. \
 \
On POSIX systems, that program will likely be GNU Make; on Microsoft \
Windows, it will be either Microsoft NMake, DMake or GNU Make. See the \
section on the L</'MAKE'> parameter for details. \
 \
ExtUtils::MakeMaker (EUMM) is object oriented. Each directory below the \
current directory that contains a Makefile.PL is treated as a separate \
object. This makes it possible to write an unlimited number of Makefiles \
with a single invocation of WriteMakefile(). \
 \
All inputs to WriteMakefile are Unicode characters, not just octets. EUMM \
seeks to handle all of these correctly. It is currently still not possible \
to portably use Unicode characters in module names, because this requires \
Perl to handle Unicode filenames, which is not yet the case on Windows. \
 \
See L<ExtUtils::MakeMaker::FAQ> for details of the design and usage."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "7.78"

RPM_NAME = "perl-ExtUtils-MakeMaker-7.78-1.4.noarch.rpm"
RPM_HASH = "8fa1c46cf9f20968ac5c98697b544d75e1e49304439dd874332fe04414fcb61e03f61419bbee31c03d4d225301461ef22586e13e81d4f081f117dd237f8c83bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DynaLoader \
perl-ExtUtils--Command \
perl-ExtUtils--Command--MM \
perl-ExtUtils--Liblist \
perl-ExtUtils--Liblist--Kid \
perl-ExtUtils--MM \
perl-ExtUtils--MM-AIX \
perl-ExtUtils--MM-Any \
perl-ExtUtils--MM-BeOS \
perl-ExtUtils--MM-Cygwin \
perl-ExtUtils--MM-DOS \
perl-ExtUtils--MM-Darwin \
perl-ExtUtils--MM-MacOS \
perl-ExtUtils--MM-NW5 \
perl-ExtUtils--MM-OS2 \
perl-ExtUtils--MM-OS390 \
perl-ExtUtils--MM-QNX \
perl-ExtUtils--MM-UWIN \
perl-ExtUtils--MM-Unix \
perl-ExtUtils--MM-VMS \
perl-ExtUtils--MM-VOS \
perl-ExtUtils--MM-Win32 \
perl-ExtUtils--MM-Win95 \
perl-ExtUtils--MY \
perl-ExtUtils--MakeMaker \
perl-ExtUtils--MakeMaker---version \
perl-ExtUtils--MakeMaker--Config \
perl-ExtUtils--MakeMaker--Locale \
perl-ExtUtils--MakeMaker--charstar \
perl-ExtUtils--MakeMaker--version \
perl-ExtUtils--MakeMaker--version--regex \
perl-ExtUtils--MakeMaker--version--vpp \
perl-ExtUtils--Mkbootstrap \
perl-ExtUtils--Mksymlists \
perl-ExtUtils--testlib \
perl-ExtUtils-MakeMaker \
perl-MM \
perl-MY"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
