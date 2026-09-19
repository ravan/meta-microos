SUMMARY = "Guess file type"
DESCRIPTION = "checktype_filename(), checktype_filehandle() and checktype_contents returns \
string contains file type with MIME mediatype format."
LICENSE = "Apache-1.0"

PV = "1.30"

RPM_NAME = "perl-File-MMagic-1.30-5.42.noarch.rpm"
RPM_HASH = "bf691594a7fe1221dcdc4f23de2b477cab02a83d5ace22abfc456d0ff133b4b228a1d3866e1444dccde143333a8abaaaac40ffd7cac537ae1526829f3396c751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--MMagic \
perl-File-MMagic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
