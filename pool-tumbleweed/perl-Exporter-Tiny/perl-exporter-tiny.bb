SUMMARY = "An exporter with the features of Sub::Exporter but only core dependencies"
DESCRIPTION = "Exporter::Tiny supports many of Sub::Exporter's external-facing features \
including renaming imported functions with the '-as', '-prefix' and \
'-suffix' options; explicit destinations with the 'into' option; and \
alternative installers with the 'installer' option. But it's written in \
only about 40% as many lines of code and with zero non-core dependencies. \
 \
Its internal-facing interface is closer to Exporter.pm, with configuration \
done through the '@EXPORT', '@EXPORT_OK' and '%EXPORT_TAGS' package \
variables. \
 \
If you are trying to *write* a module that inherits from Exporter::Tiny, \
then look at: \
 \
  * Exporter::Tiny::Manual::QuickStart \
 \
  * Exporter::Tiny::Manual::Exporting \
 \
If you are trying to *use* a module that inherits from Exporter::Tiny, then \
look at: \
 \
  * Exporter::Tiny::Manual::Importing"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006003"

RPM_NAME = "perl-Exporter-Tiny-1.006003-1.5.noarch.rpm"
RPM_HASH = "4c7858a738af5b6eac0dd69b11bff3ecfe101507a9b40e65a87e7aed99b6618a8a57ccb7471f9a9bc13e5590ff6e4122a0b3eec067e56cfb3024cab397d6ae20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exporter--Shiny \
perl-Exporter--Tiny \
perl-Exporter-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
