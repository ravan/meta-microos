SUMMARY = "YaST2 - Data files for Country settings"
DESCRIPTION = "Data files for yast2-country together with the most often used API \
functions (Language module)"
LICENSE = "GPL-2.0-only"

PV = "5.0.5"

RPM_NAME = "yast2-country-data-5.0.5-1.2.aarch64.rpm"
RPM_HASH = "bac2909536934aebeca21e92e5417e196ebd32aab137f98ff07d70512a51f77f3dec2a801c8bdaa585f58a23fa8e05c3dc92791bf82051c44c903c143dbe1841"

RPROVIDES:${PN} += "yast2-country-data"

RDEPENDS:${PN} += "yast2-ruby-bindings"

inherit rpm
