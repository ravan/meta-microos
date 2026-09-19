SUMMARY = "Match globbing patterns against text"
DESCRIPTION = "Text::Glob implements glob(3) style matching that can be used to match \
against text, rather than fetching names from a filesystem. If you want to \
do full file globbing use the File::Glob module instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.110.0"

RPM_NAME = "perl-Text-Glob-0.110.0-1.7.noarch.rpm"
RPM_HASH = "7c570399096a9e7ef73c251fcc196dbf681d6dea27c335a4f9c70db126ee8e164358ab936f1a7c397b9762eb826e3b62379fbd2f90ea4f50a622930b80230a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Glob \
perl-Text-Glob"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
