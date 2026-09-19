SUMMARY = "YaST2 - Country Settings (Language, Keyboard, and Timezone)"
DESCRIPTION = "Country specific data and configuration modules (language, keyboard, \
timezone) for yast2."
LICENSE = "GPL-2.0-only"

PV = "5.0.5"

RPM_NAME = "yast2-country-5.0.5-1.2.aarch64.rpm"
RPM_HASH = "f84be04c38f0c13a9691122c14fd921d7908a49fa93eeb8f8a066777263c1ebdc7bfcc73a1e1bc17ef2def702c4f41568b322096b41f1298bdd9c17ec8bf6e96"

RPROVIDES:${PN} += "perl-YaPI--LANGUAGE \
perl-YaPI--TIME \
yast2-country"

RDEPENDS:${PN} += "rubygem-ruby-4.0.0-ruby-dbus \
timezone \
yast2 \
yast2-core \
yast2-country-data \
yast2-hardware-detection \
yast2-packager \
yast2-perl-bindings \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-trans-stats"

inherit rpm
