SUMMARY = "Guess C++ compiler and flags"
DESCRIPTION = "'ExtUtils::CppGuess' attempts to guess the system's C++ compiler that is \
compatible with the C compiler that your perl was built with. \
 \
It can generate the necessary options to the Module::Build constructor or \
to ExtUtils::MakeMaker's 'WriteMakefile' function."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-ExtUtils-CppGuess-0.270.0-2.12.aarch64.rpm"
RPM_HASH = "c1054d9d4104faed9dd03ba14c5a2bc93ef7a8091bcfbbe5d0ea03c796a8f239ea573588187c7a5f288b1e6a2de98842e3fa0ae7672f034b51b1acb28071c75c"

RPROVIDES:${PN} += "perl-ExtUtils--CppGuess \
perl-ExtUtils-CppGuess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Capture--Tiny \
perl-ExtUtils--ParseXS"

inherit rpm
