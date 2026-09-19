SUMMARY = "Trap exit codes, exceptions, output, etc"
DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval on \
steroids, configurable and extensible, but by default trapping (Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values from boxed blocks of test code. \
 \
The values collected by the latest trap can then be queried or tested \
through a special trap object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.5"

RPM_NAME = "perl-Test-Trap-0.3.5-1.18.noarch.rpm"
RPM_HASH = "ba3b64587acf37c11dea1119df6b81500518383e13137750e185cd789e0d66924510e70cb63ba59c66c4f49eeac95122ef8df369c320b056be24561f7885fb73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Trap \
perl-Test--Trap--Builder \
perl-Test--Trap--Builder--PerlIO \
perl-Test--Trap--Builder--SystemSafe \
perl-Test--Trap--Builder--TempFile \
perl-Test-Trap"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Dump \
perl-Test--Tester \
perl-version"

inherit rpm
