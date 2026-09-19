SUMMARY = "Exporting done right"
DESCRIPTION = "Exporter::Declare is a meta-driven exporting tool. Exporter::Declare tries \
to adopt all the good features of other exporting tools, while throwing \
away horrible interfaces. Exporter::Declare also provides hooks that allow \
you to add options and arguments for import. Finally, Exporter::Declare's \
meta-driven system allows for top-notch introspection."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.114"

RPM_NAME = "perl-Exporter-Declare-0.114-1.40.noarch.rpm"
RPM_HASH = "84f299507a1b51aecbf88bfe6764a8badbbad12e9ca27e558be8ccc455eb6227d312e26fa5d3a7b00c8964e6b5832823280116aa1d892be04f66a7a1eda4b600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Declare \
perl-Exporter--Declare--Export \
perl-Exporter--Declare--Export--Alias \
perl-Exporter--Declare--Export--Generator \
perl-Exporter--Declare--Export--Sub \
perl-Exporter--Declare--Export--Variable \
perl-Exporter--Declare--Meta \
perl-Exporter--Declare--Specs \
perl-Exporter-Declare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Meta--Builder \
perl-aliased"

inherit rpm
