SUMMARY = "YaST2 - Package Library"
DESCRIPTION = "This package contains the libraries and modules for software management."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.13"

RPM_NAME = "yast2-packager-5.0.13-1.1.aarch64.rpm"
RPM_HASH = "87635e40e0c280a4e80faa5d7f8a3e136dabec21e1c8b012452e9214b26f11023a079b6e36dc653de035b739c570064a0d1912ef07a88da717278bca78c6af75"

RPROVIDES:${PN} += "yast2-packager"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/md5sum \
/usr/bin/perl \
augeas-lenses \
libyui-pkg \
ruby-solv \
rubygem-ruby-4.0.0-cfa \
rubygem-ruby-4.0.0-cgi \
rubygem-ruby-4.0.0-nokogiri \
unzip \
yast2 \
yast2-core \
yast2-country-data \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-storage-ng \
yast2-transfer"

inherit rpm
