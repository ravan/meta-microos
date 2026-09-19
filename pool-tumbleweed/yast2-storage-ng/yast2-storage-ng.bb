SUMMARY = "YaST2 - Storage Configuration"
DESCRIPTION = "This package contains the files for YaST2 that handle access to disk \
devices during installation and on an installed system. \
This YaST2 module uses libstorage-ng."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.0.50"

RPM_NAME = "yast2-storage-ng-5.0.50-1.1.aarch64.rpm"
RPM_HASH = "8ce724365f75a5d0ddf719eb7a506bd7634819919bac0acc2ca8837fa70093a7a35a774fe56fd3d8a261d35940c9b4cca0406b9f6b9c33472aa8e5969a35892a"

RPROVIDES:${PN} += "yast2-storage-ng"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
findutils \
libstorage-ng-ruby \
libstorage-ng-ruby-4.0.0 \
rubygem-ruby-4.0.0-ruby-dbus \
yast2 \
yast2-packager \
yast2-ruby-bindings"

inherit rpm
