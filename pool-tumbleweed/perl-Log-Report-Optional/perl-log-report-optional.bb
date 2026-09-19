SUMMARY = "Log::Report in its lightest form"
DESCRIPTION = "This module will allow libraries (helper modules) to have a dependency to a \
small module instead of the full Log-Report distribution. The full power of \
'Log::Report' is only released when the main program uses that module. In \
that case, the module using the 'Optional' will also use the full \
Log::Report, otherwise the dressed-down Log::Report::Minimal version. \
 \
For the full documentation: \
 \
* * see Log::Report when it is used by main \
 \
* * see Log::Report::Minimal otherwise \
 \
The latter provides the same functions from the former, but is the \
simpelest possible way."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.80.0"

RPM_NAME = "perl-Log-Report-Optional-1.80.0-1.5.noarch.rpm"
RPM_HASH = "29e7cb2627d1fca919f681a9e45319efce105eb2d6af963b33a14822987b7a5a920bb75995fbadab393a4c7e6a6aca2392d3993596f0dbcaccb40b6b813f3327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Report--Minimal \
perl-Log--Report--Minimal--Domain \
perl-Log--Report--Optional \
perl-Log--Report--Util \
perl-Log-Report-Optional"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-String--Print \
perl-Test--More"

inherit rpm
