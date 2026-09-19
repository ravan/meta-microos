SUMMARY = "Dump symbol names or the symbol table"
DESCRIPTION = "This little package serves to access the symbol table of perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.180.0"

RPM_NAME = "perl-Devel-Symdump-2.180.0-1.3.noarch.rpm"
RPM_HASH = "459122fae6a08fab610817107471a15756f71e99319acd7667bfe9f9072765e42390af4537c0f2a0b5562c14e5ef678d37b9df9ce02c54d6a11a79103611e84a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Symdump \
perl-Devel--Symdump--Export \
perl-Devel-Symdump"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Zlib"

inherit rpm
