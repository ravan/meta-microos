SUMMARY = "A Graphical GCOV Front-end"
DESCRIPTION = "LCOV is a graphical front-end for GCC's coverage testing tool gcov. It collects \
gcov data for multiple source files and creates HTML pages containing the \
source code annotated with coverage information. It also adds overview pages \
for easy navigation within the file structure."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "lcov-2.4-1.3.noarch.rpm"
RPM_HASH = "5b8d7fe73cab6d2dab5a7fdc84a8ee53c81685890a97877a31af9c4aa65df5c1f58d1cd348a323c7eeb17293ae93264ecfcbf18d78522ac65df82ebc0bbddcee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lcov \
lcov \
perl-AggregateTraces \
perl-BranchBlock \
perl-BranchData \
perl-BranchEntry \
perl-BranchMap \
perl-CountData \
perl-CoverageCriteria \
perl-FilterBranchExceptions \
perl-FunctionEntry \
perl-FunctionMap \
perl-HTML-fileData \
perl-InOutFile \
perl-JsonSupport \
perl-MCDC-Block \
perl-MCDC-Data \
perl-MCDC-Expression \
perl-MapData \
perl-MessageContext \
perl-P4version \
perl-PipeHelper \
perl-ReadCurrentSource \
perl-ScriptCaller \
perl-SearchPath \
perl-TraceFile \
perl-TraceInfo \
perl-ValidateHTML \
perl-annotateutil \
perl-batchGitVersion \
perl-context \
perl-criteria \
perl-gitblame \
perl-gitversion \
perl-lcovutil \
perl-p4annotate \
perl-select \
perl-simplify \
perl-threshold"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
findutils \
gcc \
perl-Capture-Tiny \
perl-DateTime \
perl-GD \
perl-PerlIO-gzip \
perl-TimeDate"

inherit rpm
