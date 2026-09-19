SUMMARY = "Sophisticated exporter for custom-built routines"
DESCRIPTION = "*ACHTUNG!* If you're not familiar with Exporter or exporting, read \
Sub::Exporter::Tutorial first!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.991.0"

RPM_NAME = "perl-Sub-Exporter-0.991.0-2.12.noarch.rpm"
RPM_HASH = "6f8494956fd011de3c5060b682d14ba6a9f51a492ae8dbcbf3282a0b61b473767cdeb1eb8ab99bcbf55b218baf39584d234a242f6856fbe78cf97d8bf23f8ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub-Exporter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--OptList \
perl-Params--Util \
perl-Sub--Install"

inherit rpm
