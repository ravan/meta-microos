SUMMARY = "Alternative but compatible interface to modules that export symbols"
DESCRIPTION = "This module acts as a layer between Exporter and modules which consume \
exports. It is feature-compatible with Exporter, plus some much needed \
extras. You can use this to import symbols from any exporter that follows \
Exporters specification. The exporter modules themselves do not need to use \
or inherit from the Exporter module, they just need to set '@EXPORT' and/or \
other variables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.026"

RPM_NAME = "perl-Importer-0.026-1.28.noarch.rpm"
RPM_HASH = "17067b5dd6750b58569ffef8ccef235dacc44eec929c36116a547e6b138eb70b1ad6aa497f0705b3df5a9d40bcf3f7f3268d8dcd0476fb40d44cf4ea33a7ae4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Importer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
