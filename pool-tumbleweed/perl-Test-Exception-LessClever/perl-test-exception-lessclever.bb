SUMMARY = "(DEPRECATED) Test::Exception simplified"
DESCRIPTION = "(DEPRECATED) Test::Exception simplified"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Test-Exception-LessClever-0.009-1.40.noarch.rpm"
RPM_HASH = "23a1c64715c716a5863b3ba598f2204cf47b75e5ed3cd8f63088afe0b7406334b699cfab116d86273de5842440c429500dcb367a67d2e8caf0180fda2fc0e06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Exception--LessClever \
perl-Test-Exception-LessClever"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
