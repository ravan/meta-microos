SUMMARY = "Find and read perl modules like perl does"
DESCRIPTION = "This module finds modules in '@INC' using the same algorithm perl does. \
From that, it will give you the source content of a module, the file name \
(where available), and how it was found. Searches (and content) are based \
on the same internal rules that perl uses for _require|perlfunc/require_ \
and _do|perlfunc/do_."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.003003"

RPM_NAME = "perl-Module-Reader-0.003003-2.15.noarch.rpm"
RPM_HASH = "13baeb22e4f31ce4ba37756fd36d8b3271ce35e08f6dafc315172d4b1f5b50dc15c623a878ddae6cd6885acd855dafdd544e3d0ec74e8f468df1b836d4280f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Reader \
perl-Module--Reader--File \
perl-Module-Reader"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
