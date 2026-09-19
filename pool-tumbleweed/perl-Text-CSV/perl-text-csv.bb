SUMMARY = "Comma-separated values manipulator (using XS or PurePerl)"
DESCRIPTION = "Text::CSV is a thin wrapper for Text::CSV_XS-compatible modules now. All \
the backend modules provide facilities for the composition and \
decomposition of comma-separated values. Text::CSV uses Text::CSV_XS by \
default, and when Text::CSV_XS is not available, falls back on \
Text::CSV_PP, which is bundled in the same distribution as this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.60.0"

RPM_NAME = "perl-Text-CSV-2.60.0-1.8.noarch.rpm"
RPM_HASH = "d415e6177ee34e637b5551e61c474342644bf93712c3b7bd2855228c83e94c4b33960d35953d6add6696b796cb78abed94bd537f6dd7dd23ff64a64c8ee9e83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--CSV \
perl-Text--CSV--ErrorDiag \
perl-Text--CSV-PP \
perl-Text-CSV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
